public class DoWhileDemo {
    public static void main(String[] args)
    throws java.io.IOException{

        char ch;

        do{
            System.out.println("press a key followed by enter");
            ch = (char) System.in.read();
        }while (ch!='q');

    }
}
