public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println(sumDigit(125));
        System.out.println(sumDigit(7));
        System.out.println(sumDigit(-431));
        System.out.println(sumDigit(32414));


    }

    public static int sumDigit(int number){
        if (number<10){
            System.out.println("invalid");
             return -1;

        }

        int sum = 0;
        // to help visualize 125-> 125/10 = 12 *10 -> 120->125-120=5;
        while (number>0){
            // extract the least significant digit

            int digit = number%10;
            sum += digit;
            // drop least significant digit

            number /= 10;  //number = number/10;
        }
         return sum;
    }
}
