package creatures;


import com.devices.SaleAble;

public abstract class Animal implements SaleAble, Feedable {

    private static final double DEFAULT_FOOD_WIHGHT = 1;
    protected double weight;
    protected boolean isAlive;
    //private boolean isAlive;
    public String species;
    String name;
    Integer age;
    //private Double weight;   //tu zrobic private
    Boolean alive;

   public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        this.alive = true;
        if (this.species == "canis") {
            this.weight = 10.0;
        } else if (this.species == "felis") {
            this.weight = 2.0;
        } else {
            this.weight = 1.0;
        }

        System.out.println(IntroduceYourSelf());
    }

    @Override
    public void feed() {
        this.feed(DEFAULT_FOOD_WIHGHT);
    }

    @Override
    public void feed(Double footWeight) {
        ItAllive();
        if (alive) {
            weight += 1;
            System.out.println("Food, new weight:" + weight);
        }
    }


    public void takeForAWalk() {
        ItAllive();
        if (alive) {
            weight -= 1;
            System.out.println("Walk, new weight:" + weight);
        }
    }



    void ItAllive() {
        if (weight <= 1) {
            alive = false;
            System.out.println("The animal died");
        }

    }


    String IntroduceYourSelf() {
        return "Im " + species + ", my name is " + name + " and my weight is " + weight + ".";

    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }
}