package org.example;

public class AnimalUtils {
    private AnimalDAO aDAO;

    public void setaDAO(AnimalDAO aDAO) {
        this.aDAO = aDAO;
    }

    public void runUtils(){
        Animal ellyElephant = new Animal("Elly", 9, Animal.GenderType.FEMALE);
        Zoo zoo = new Zoo("Debecen Zoo");
        ellyElephant.setOwnerZoo(zoo);
        aDAO.saveAnimal(ellyElephant);
    }
}
