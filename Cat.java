public class Cat implements Pet {

    String typeOfPet;
    String nameOfPet;

    public Cat(String name) {
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

    void mew() {
        System.out.println("--MEW MEW--");
    }

    
}
