public class GuessTheLetterGame {
    public static void main(String[] args)
    throws java.io.IOException{

        char ch , answer= 'K';

        System.out.println("tell us your guessed letter please");

        System.out.print("can you guess it?");

        ch = (char) System.in.read();
        if(ch == answer) System.out.println("********you are right********");
        else {
            System.out.print("you are");

            if (ch < answer) System.out.println(" too low");
            else System.out.println(" high");
        }
    }



}
