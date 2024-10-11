package be.pxl.ja.exercise;

public class Pet {
    private static final int MAX_ENERGY = 100;
    private static final int MIN_ENERGY = 0;
    private int energie;

    public Pet(int energie) {
        setEnergie(energie);
    }

    public int getEnergie() {
        return energie;
    }

    private void setEnergie(int energie) {

        this.energie = Math.max(MIN_ENERGY, Math.min(energie, MAX_ENERGY));
    }

    public void feed(String food){
        if ("chocolate".equals(food)){
            throw new WrongFoodException("You cannot feed the pet chocolate");
        }
        setEnergie(energie + 20);
    }

    public void play() throws PetTiredException{
        if (energie < 20) {
            throw new PetTiredException("Pet doesn't have the energy to play");
        }
        setEnergie(energie - 30);
    }

    @Override
    public String toString() {
        return "Per's energy is " + energie;
    }
}
