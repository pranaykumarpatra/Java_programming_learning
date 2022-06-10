public class MethodChallenge {
    public static void main(String[] args) {

        double calculatedCentimeter= calcFeetAndInchesToCentimeter(1,0);
        System.out.println(calculatedCentimeter);

        calculatedCentimeter = calcFeetAndInchesToCentimeter(1);
        System.out.println(calculatedCentimeter);
    }

    public static double calcFeetAndInchesToCentimeter(double foot, double inches ){
        if(foot <0 && inches >=12){
            return -1;
        }else {
            inches = foot*12;
            double centimeter= inches*2.54;
            return centimeter;
        }
    }
    public static double calcFeetAndInchesToCentimeter(double foot){
        if(foot <= 0){
            return -1;
        }else{
            double inches = foot*12;
            return inches;



        }
    }
}
