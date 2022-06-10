import java.util.Scanner;

public class InputReading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your birth year:-");

        boolean validYear = input.hasNextInt();

        if (validYear){
            int yearOfBirth = input.nextInt();

             input.nextLine();

            System.out.println("enter your name :-");
            String name =  input.nextLine();

            int age = 2022- yearOfBirth;
            if(age >=0 && age <=100){
                System.out.println("Hey " + name + " your age is " + age);
            }else{
                System.out.println("check your year of birth ");
            }


        }else {
            System.out.println("enter a valid year of birth");
        }

    }
}
