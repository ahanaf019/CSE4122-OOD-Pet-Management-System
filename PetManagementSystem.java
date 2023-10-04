public class PetManagementSystem {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Sparrow");
        Dog dog1 = new Dog("Butch");
        Dog dog2 = new Dog("Spike");
        Cat cat1 = new Cat("Tom");

        SalesMan seller1 = new SalesMan("John");
        SalesMan seller2 = new SalesMan("Mark");

        Person person1 = new Person("Harry");

        seller1.addPet(cat1);
        seller1.addPet(dog1);
        seller1.addPet(dog2);
        seller2.addPet(bird1);


    }
}