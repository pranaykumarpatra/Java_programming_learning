public class SwitchInputHelp {
    public static void main(String[] args)
    throws java.io.IOException{

        char answer;
        System.out.println("Capital of INDIA\n");
        System.out.println("  1. DELHI");
        System.out.println(" \n 2. ODISHA");
        System.out.println("\n Choose one:");

        answer = (char) System.in.read();


        switch (answer){
            case '1' :
                System.out.println("\nDELHI");
                System.out.println("\nCORRECT");
                break;
            case '2':
                System.out.println("\n ODISHA");
                System.out.println("\n WRONG");
                break;
            default:
                System.out.println("PATHA PADH BSDK");
        }

    }
}
