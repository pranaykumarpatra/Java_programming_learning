import java.util.Scanner;

public class MinimumMaximumInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
//       boolean first =  true;

        while (true){
            System.out.println("enter number :");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
//                if (first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number>max){
                    max = number;
                }
                if (number<min){
                    min = number;
                }
            }else{
                break;
            }
            scanner.nextLine(); // input handle if there is an invalid input
        }
        System.out.println("min= " + min + " max= " + max);

        scanner.close();

    }
}
