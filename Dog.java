public class Dog implements Pet {

    String typeOfPet;
    String nameOfPet;
    PetOwner petOwner;

    public Dog(String name) {
        this.nameOfPet = name;
        this.typeOfPet = "dog";
        this.petOwner = null;

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
        System.out.println("--BARK SOUNDS--");
    }

    
    @Override
    public PetOwner getOwner() {
        return this.petOwner;
    }

    @Override
    public void setOwner(PetOwner owner) {
        this.petOwner = owner;
    }

    
}
