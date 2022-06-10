public class LoopUntillSisTyped {
    public static void main(String[] args)
    throws java.io.IOException{
        int i;
        System.out.println("press s to stop");

        for (i=0; System.in.read() != 'S' ; i++ )
            System.out.println(i);
    }

}
