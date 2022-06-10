public class HelpSystemUsingSwitchCase {
    public static void main(String[] args)
    throws java.io.IOException{


        System.out.println("help on:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("choose one:");
        char choice = (char) System.in.read();


        System.out.println("\n");

        switch (choice) {
            case '1' :
                System.out.println("The if \n");
                System.out.println("if (condition) statement;");
                System.out.println(" else statement;");
                break;

            case '2':
                System.out.println("The switch \n");
                System.out.println("switch (expression) {");
                System.out.println("  case constant: ");
                System.out.println("  statement sequence");
                System.out.println("   break;");
                System.out.println(" //......");
                System.out.println("}");
                break;

            default:
                System.out.println(" selection not found");
        }

    }
}
