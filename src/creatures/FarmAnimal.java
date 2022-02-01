package creatures;

import com.devices.Human;

public class FarmAnimal extends Animal implements Edbile{


        public FarmAnimal(String species, String name) {
        super(species, name);
    }
        boolean beEaten = false;

    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println(this.species);
        if(beEaten == false){
            System.out.println("Jasne zęmby połamiesz ");
        }else {
            System.out.println("Samcznego");
        }
    }

    @Override
    public void sell(Human buyer, Human saller, Double price) {

    }

    @Override
    public void feed(Double footWeight) {

    }
}
