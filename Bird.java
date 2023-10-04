public class Bird implements Pet {

    String typeOfPet;
    String nameOfPet;
    PetOwner petOwner;

    public Bird(String name) {
        this.nameOfPet = name;
        this.typeOfPet = "bird";
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

    void makeNoise() {
        System.out.println("--BIRD NOISES--");
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
