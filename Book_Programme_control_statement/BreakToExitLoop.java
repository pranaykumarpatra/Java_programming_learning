public class BreakToExitLoop {
    public static void main(String[] args) {
        int num;
        num = 100;

        for (int i=0;i<num;i++)
        {
            if (i*i >= num)
                break;
            System.out.println(i + " ");

        }

        System.out.println("loop complete");
    }
}
