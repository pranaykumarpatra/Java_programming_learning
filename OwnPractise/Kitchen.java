public class Kitchen {
    private String nameOfTheKitchen;
    private Utencils utencils;
    private Induction induction;
    private GasStove gasStove;

    public Kitchen(String nameOfTheKitchen, Utencils utencils, Induction induction, GasStove gasStove) {
        this.nameOfTheKitchen = nameOfTheKitchen;
        this.utencils = utencils;
        this.induction = induction;
        this.gasStove = gasStove;
    }

    public String getNameOfTheKitchen() {
        return nameOfTheKitchen;
    }

    public Utencils getUtencils() {
        return utencils;
    }

    public Induction getInduction() {
        return induction;
    }

    public GasStove getGasStove() {
        return gasStove;
    }
}
