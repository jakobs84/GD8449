package com.devices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

//import static com.sun.imageio.plugins.jpeg.JPEG.version;

public class Phone extends Devices implements SaleAble {

    private static final String DEFAULT_VERSION_NAME = "apka_zdrapka";
    private static final int DAFAULT_PORT_NAME = 433;
    private static final String DEFAULT_SERVER_NAME = "apka.wsb.pl";

    public Phone(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    @Override
    public void turnOn() {
        System.out.println("Push button!!");
    }


    public void installAnApp(String appName) {
        System.out.println("Instaluje aplikacje: "+ appName);
            this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version){
        System.out.println("Instaluje aplikacje: "+ appName + " w wersji " + version);
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName, String verison, String server){
        try{
           // URL url = new URL("https", server, DAFAULT_PORT_NAME ,appName + "-" + verison);
            URL url = new URL("https", server, DAFAULT_PORT_NAME,"/"+appName+"/"+verison);
            this.installAnApp(url);
            //System.out.println(url);
        } catch (MalformedURLException e) {
            System.out.println("Error!!!");
            e.printStackTrace();
        }
    }

    public void installAnApp(List<String>appNames){
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

public void installAnApp(URL url){

    System.out.println("Sprawdzam czy masz miejsce");
    System.out.println("Sprawdzam czy cię stać ");
    System.out.println("Pobieranie - " + url);
    System.out.println("Instalacja");
    System.out.println("Czyszczenie");
}


    @Override
    public void sell(Human buyer, Human saller, Double price) {
        if (buyer.casch < price)
        {
            System.out.println("Sory the buyer doesn't have enough money to buy Phone " +saller.phone.producer +" "+ saller.phone.model);
        } else if (saller.hasCar()== null) {
            System.out.println("Sorry the seller doesn't have a Phone ");
        } else {
            saller.casch +=price;
            buyer.casch -=price;
            saller.phone = null;
            buyer.phone = this;
            System.out.println("Congratulations you bought a brick - " +buyer.phone.producer +" "+ buyer.phone.model );

        }
    }
}
