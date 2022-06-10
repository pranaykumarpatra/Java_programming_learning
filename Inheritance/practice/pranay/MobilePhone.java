package practice.pranay;

public class MobilePhone {
    private int ram;
    private int rom;
    private String brand;

    public MobilePhone(int ram, int rom, String brand) {
        this.ram = ram;
        this.rom = rom;
        this.brand = brand;
    }

    public void displaySize(){
        System.out.println("the display size is minimum 5-6 inch");
    }
    public void priceSegment(double price){
        System.out.println("the price of the brand is " + price);

    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getBrand() {
        return brand;
    }
}
