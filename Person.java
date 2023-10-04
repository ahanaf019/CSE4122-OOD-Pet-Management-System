import java.util.ArrayList;

public class Person implements PetOwner {

    String personName;
    ArrayList<Pet> pets;

    public Person(String name) {
        this.personName = name;
        pets = new ArrayList<Pet>();
    }

    @Override
    public void addPet(Pet pet) {
        pet.setOwner(this);
        pets.add(pet);
    
    }

    @Override
    public void removePet(Pet pet) {
        String name = pet.getName();

        for(int i = 0; i < pets.size(); i++) {
            if(pets.get(i).getName() == name) {
                pets.remove(i);
                System.out.println("Successfully Removed Pet");
                return;
            }
        }

        System.out.println("Error! Pet not found.");
    }

    @Override
    public int getPetCount() {
        return pets.size();
    }

    @Override
    public String getName() {
        return personName;
    }

    public void buyPet(Pet pet, SalesMan owner) {

        if(pet == null) {
            System.out.println("Buying Faild. Seller does not have the pet you want.");
            return;
        }

        owner.removePet(pet);
        addPet(pet);
        System.out.println(personName + " bought a " + pet.getTypeOfPet() + " with name: " + pet.getName() + " from " + owner.getName());
    }

    @Override
    public Pet getPet(String name) {
        for(int i = 0; i < pets.size(); i++) {
            if(pets.get(i).getName() == name) {
                return pets.get(i);
            }
        }
        System.out.println("Error! Pet not found with given name.");
        return null;
    }

    
}
