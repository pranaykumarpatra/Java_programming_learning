public class UsingBreakWithLabel {
    public static void main(String[] args) {
        int i;

        for (i=1;i<4;i++){
        one:    {
           two:     {
                 three:   {
                     System.out.println("\ni is " + i);
                     if (i==1) break one;
                     if (i==2)break two;
                     if (i==3) break three;
// this is the statement never reached.
                     System.out.println("never prints");

                    }
               System.out.println("after block three");
                }
            System.out.println("after block two");
            }
            System.out.println("after block one");
        }
        System.out.println("after for. ");

        // another example

        done:
        for (int a=0;a<10;a++){
            for (int b=0;b<10;b++){
                for (int c=0;c<10;c++){
                    System.out.println(c + " ");
                    if (c==5) break done;
                }
                System.out.println("after c loop");
            }
            System.out.println("after b loop");
        }
        System.out.println("after a loop");
    }
}
