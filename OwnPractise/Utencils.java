public class Utencils {
    private int numberOfGlasses;
    private int numberOfSpoons;
    private int numberOfContainers;

    public Utencils(int numberOfGlasses, int numberOfSpoons, int numberOfContainers) {
        this.numberOfGlasses = numberOfGlasses;
        this.numberOfSpoons = numberOfSpoons;
        this.numberOfContainers = numberOfContainers;
    }
    public void broken(int brokenItems){
        System.out.println("the number of broken items in the kitchen is " + brokenItems);
    }

    public int getNumberOfGlasses() {
        return numberOfGlasses;
    }

    public int getNumberOfSpoons() {
        return numberOfSpoons;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }
}
