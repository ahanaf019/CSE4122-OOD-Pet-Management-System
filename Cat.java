public class Cat implements Pet {

    String typeOfPet;
    String nameOfPet;
    PetOwner petOwner;

    public Cat(String name) {
        this.nameOfPet = name;
        this.typeOfPet = "cat";
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

    void mew() {
        System.out.println("--MEW MEW--");
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
