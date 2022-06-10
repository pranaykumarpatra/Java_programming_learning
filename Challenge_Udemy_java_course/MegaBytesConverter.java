public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kb){

        if(kb<0){
            System.out.println("invalid value");
        }else{
            int mb = kb/1024;
            int remainingKb= kb%1024;

            System.out.println(kb + " KB = " + mb + " MB " + remainingKb + " kb" );
        }
    }
}
