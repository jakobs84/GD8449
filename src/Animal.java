

public class Animal {

    String species;
    String name;
    Integer age;
    private Double weight;   //tu zrobic private
    Boolean alive;

    Animal(String species) {
        this.species = species;
        this.alive = true;
        if (this.species == "canis") {
            this.weight = 10.0;
        } else if (this.species == "felis") {
            this.weight = 2.0;
        } else {
            this.weight = 1.0;
        }
        System.out.print("Gatunek :" + species);
        System.out.println(", waga :" + weight);
    }

    void feed() {
        ItAllive();
        if (alive) {
            weight += 1;
            System.out.println("Karma nowa waga:" + weight);
        }
    }


    void takeForAWalk() {
        ItAllive();
        if (alive) {
            weight -= 1;
            System.out.println("Spacer nowa waga:" + weight);
        }
    }



    void ItAllive() {
        if (weight <= 1) {
            alive = false;
            System.out.println("Zwierzak zdechł");
        }

    }
}