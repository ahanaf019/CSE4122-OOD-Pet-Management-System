public class PetManagementSystem {
    public static void main(String[] args) {

        SalesMan seller1 = new SalesMan("John");
        SalesMan seller2 = new SalesMan("Mark");

        Person person1 = new Person("Harry");

        seller1.addPet(new Cat("Tom"));
        seller1.addPet(new Dog("Spike"));
        seller1.addPet(new Dog("Butch"));
        seller2.addPet(new Bird("Sparrow"));

        System.out.println(person1.getName() + " currently has " + person1.getPetCount() + " pets.");
        System.out.println(seller1.getName() + " currently has " + seller1.getPetCount() + " pets.");

        person1.buyPet(seller1.getPet("Tommy"), seller1);
        person1.buyPet(seller1.getPet("Tom"), seller1);  


        System.out.println(person1.getName() + " currently has " + person1.getPetCount() + " pets.");
        System.out.println(seller1.getName() + " currently has " + seller1.getPetCount() + " pets.");






    }
}