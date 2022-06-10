import java.util.Scanner;

public class ReadingInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =0;
        int sum=0;

        while (count<10){
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                long number = scanner.nextInt();
                count++;
                sum += number;
                if (count==10){
                    break;
                }

            }else{
                System.out.println("enter a valid number");
            }

            scanner.nextLine();

        }
        System.out.println("the sum of the number you entered = " + "\n" +sum);
        scanner.close();
    }
}
