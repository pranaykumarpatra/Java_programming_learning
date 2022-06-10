import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("enter year of birth ");
        boolean isItAnInt =  scanner.hasNextInt();//  checks if the input is an int

      if (isItAnInt){
        int yearOfBirth = scanner.nextInt();

        scanner.nextLine(); // handle next line

        System.out.println("enter your name :- ");
        String name = scanner.nextLine();

        int age = 2022-yearOfBirth;

        if (age>=0 && age <=100) {
          System.out.println("hey! " + name + " your age is " + age);
        }else {
          System.out.println("Enter a valid year of birth");
        }
      }else {
        System.out.println("enter a valid number");
      }


        scanner.close();
    }
}
