public class ReadFromKeyboard {
    public static void main(String[] args)
    throws java.io.IOException{

        char ch;


        System.out.println("enter a key followed by enter");

        ch= (char) System.in.read();

        System.out.println("your key is " + ch);

    }
}
