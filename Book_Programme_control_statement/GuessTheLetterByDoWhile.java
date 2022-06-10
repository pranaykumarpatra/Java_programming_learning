public class GuessTheLetterByDoWhile {
    public static void main(String[] args)
    throws java.io.IOException{
        char ch, ignore, answer = 'A';

        do {
            System.out.println("I am thinking a letter between A to Z");
            System.out.println("can you guess it: ");

            ch= (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');

            if (ch == answer) System.out.println("***RIGHT***");
            else {
                System.out.println("sorry you are ");
                if(ch<answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("try again\n");
            }
        }while (answer!=ch);
    }
}
