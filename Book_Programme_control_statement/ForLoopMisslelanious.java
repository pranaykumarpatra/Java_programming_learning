public class ForLoopMisslelanious {
    public static void main(String[] args) {
        PartMissing();
        LoopWithNoBody();

    }
    public static void PartMissing(){
        int i;

        i=0;
        for (;i<6;i++) {
            System.out.println(i);
        }
        int a;
        for (a=0;a<8;) {
            a++;
            System.out.println(a);
        }



        int b ;


            b = 0;
            for (; b < 6; ) {
                b++;
                System.out.println(b);
            }

    }
    public static void LoopWithNoBody(){
        int a, sum=0;
        for (a=1;a<= 5; sum+= a++);
        System.out.println("\n " + sum);
    }
}
