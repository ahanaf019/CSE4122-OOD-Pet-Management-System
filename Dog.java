public class Dog implements Pet {

    String typeOfPet;
    String nameOfPet;

    public Dog(String name) {
        this.nameOfPet = name;
    } 
    
    @Override
    public String getName() {
        return nameOfPet;
    }

    @Override
    public String getTypeOfPet() {
        return typeOfPet;
    }

    @Override
    public void setName(String name) {
        this.nameOfPet = name;
        System.out.println("Name Changed Successfully");
    }

    public void bark() {
        System.out.println("*BARK SOUNDS*");
    }

    
}
