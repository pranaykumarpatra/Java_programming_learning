public class GasStove {
    private String brand;
    private int numberOfBurner;

    public GasStove(String brand, int numberOfBurner) {
        this.brand = brand;
        this.numberOfBurner = numberOfBurner;
    }

    public void brand(){
        System.out.println("the gas stove is of hawkins brand");
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfBurner() {
        return numberOfBurner;
    }
}
