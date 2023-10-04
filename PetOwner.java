public interface PetOwner {
    public void addPet(Pet pet);    
    public Pet getPet(String name);
    public void removePet(Pet pet);
    public int getPetCount();
    public String getName();
}
