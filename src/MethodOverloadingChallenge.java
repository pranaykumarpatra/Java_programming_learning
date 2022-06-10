public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6,0);


        calcFeetAndInchesToCentimeter(12);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if ((feet <=0) | (inches<0) | (inches>12)){
            System.out.println("INVALID INPUT");
            return -1;
        }else{
            inches = feet*12;
            double centimeter= inches*2.54;
            System.out.println(centimeter);
            return centimeter;
        }

    }
    public static double calcFeetAndInchesToCentimeter(double inches){
        if(inches <= 0){
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches%12;

            System.out.println(inches + "inches is equals to " + feet + " feet and " + remainingInches + " Inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);

        }
    }
}
