package creatures;


import com.devices.Human;

public class Pet extends Animal{

    public Pet(String species, String name) {
        super(species, name);
    }

    @Override
    public void sell(Human buyer, Human saller, Double price) {

    }
}
