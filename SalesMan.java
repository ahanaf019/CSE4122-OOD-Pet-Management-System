import java.util.ArrayList;

public class SalesMan implements PetOwner {

    String salesManName;
    ArrayList<Pet> pets;

    public SalesMan(String name) {
        this.salesManName = name;
        pets = new ArrayList<Pet>();
    }

    @Override
    public void addPet(Pet pet) {
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
        return salesManName;
    }

    public void sellPet(Pet pet, PetOwner newOwner) {
        newOwner.addPet(pet);
        removePet(pet);
    }
    
}
