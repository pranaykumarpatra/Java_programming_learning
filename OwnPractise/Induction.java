public class Induction {
    private String brand;

    public Induction(String brand) {
        this.brand = brand;
    }

    public void cookingTime(int time){
        System.out.println("the average cooking time was " + time + "hours");
    }

    public String getBrand() {
        return brand;
    }
}
