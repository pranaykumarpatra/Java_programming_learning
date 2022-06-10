package practice.pranay;

import java.net.PortUnreachableException;

public class iPhone extends MobilePhone{
    private String model;


    public iPhone(int ram, int rom, String brand, String model) {
        super(ram, rom, brand);
        this.model = model;


    }
    private void priceRange(){
        priceSegment(50000.00);
    }
    private void displayQuality(){
        System.out.println("it has O-LED feature");
    }

    @Override
    public void displaySize() {
        displayQuality();
        priceRange();
        super.displaySize();
    }

}
