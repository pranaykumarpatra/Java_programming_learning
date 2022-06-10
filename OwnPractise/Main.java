public class Main {
    public static void main(String[] args) {
        GasStove gasStove = new GasStove("Hawkins",2);
        Induction induction= new Induction("Pigeon");
        Utencils utencils = new Utencils(10,5,20);

        Kitchen kitchen = new Kitchen("mama's kitchen",utencils,induction,gasStove);


        kitchen.getGasStove().brand();
        kitchen.getInduction().cookingTime(5);
        kitchen.getUtencils().broken(3);

        System.out.println(gasStove.getBrand());
        System.out.println(induction.getBrand());
        System.out.println(utencils.getNumberOfGlasses());
    }
}
