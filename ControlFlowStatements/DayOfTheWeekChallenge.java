public class DayOfTheWeekChallenge {
    public static void main(String[] args)
    throws java.io.IOException{



        printDayOfTheWeek();

    }

    public static void printDayOfTheWeek()
    throws java.io.IOException{
char day = (char) System.in.read();

        switch (day){
            case '0':
                System.out.println("SUNDAY");
                break;
            case '1':
                System.out.println("monday");
                break;
            case '2':
                System.out.println("tuesday");
                break;
            case '3':
                System.out.println("wednesday");
                break;
            case '4':
                System.out.println("thursday");
                break;
            case '5':
                System.out.println("friday");
                break;
            case '6':
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}
