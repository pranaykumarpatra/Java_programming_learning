public class DoWhileChallenge {
    public static void main(String[] args) {

        boolean CheckNumber = isEvenNumber(4325435432671L);
        if (CheckNumber){
            System.out.println("even");
        }else
            System.out.println("odd");

    }

    public static boolean isEvenNumber(double number){

        return number%2==0;

    }
}
