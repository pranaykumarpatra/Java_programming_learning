public class SwitchCaseWithNoBreak {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("1");
                case 1:
                    System.out.println("2");
                case 3:
                    System.out.println("3");
                case 4:
                    System.out.println("4");

            }
            System.out.println();
        }
    }
}
