
public class Clover extends TestCritter {

    public String toString() {
        return "@";
    }

    public boolean fight(String not_used) {
        return false;
    }

    public void doTimeStep() {
        setEnergy(getEnergy() + Params.PHOTOSYNTHESIS_ENERGY_AMOUNT);
    }
}
