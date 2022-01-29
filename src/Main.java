public class Main {
    public Main() { /* compiled code */ }

    public static void main(String[] args) {

  // Task 1
        Animal dog = new Animal("canis", "Szarik");

        dog.species = "pies";
        dog.age = 8;
  /*
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
*/
        Human kacper = new Human();
        kacper.firstName = "Kacper";
        kacper.lastNam = "Brzęczyszczykiewiscz";
        kacper.age = 21;
        kacper.pet = dog;

        Car bryka = new Car("Honda", "Crv");
        kacper.vehicle = bryka;


    }
}
