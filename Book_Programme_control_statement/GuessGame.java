public class GuessGame {
    public static void main(String[] args)
    throws java.io.IOException{
        char ch,ignore,answer='A';



        do {
            System.out.println("can u guess the answer:- ");
            ch=(char) System.in.read();
            do {
                ignore = (char) System.in.read();
            }while (ignore!= '\n');

            if (ch==answer) System.out.println("right");

            else {
                System.out.println("wrong try again");
            }
        }while (answer!=ch);
    }
}
