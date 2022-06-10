import java.util.Scanner;

public class DigitSumChallengeWithInput {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
            System.out.println("please enter a number");
            boolean isValidInput = scanner.hasNextInt();

            if (isValidInput) {
                int number = scanner.nextInt();
                if (number<0){
                    System.out.println("invalid");
                }
                System.out.println("the number you entered is =  " + number);
                // to help visualize 125-> 125/10 = 12 *10 -> 120->125-120=5;
                while (number > 0) {
                    // extract the least significant digit
                    int digit = number % 10;
                    sum += digit;
                    // drop least significant digit

                    number /= 10;  //number = number/10;
                }

            }

            System.out.println("the sum of the digits are :- " + sum);
        scanner.close();
        }

}



