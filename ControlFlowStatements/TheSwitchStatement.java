public class TheSwitchStatement {
    public static void main(String[] args) {
        int value =2;
        if (value==1){
            System.out.println("value was 1");
        }else if (value==2) {
            System.out.println("value was 2");
        }else {
            System.out.println(" was not 1 or 2");
        }

        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                break;
            default:
                System.out.println("not 1 or 2");
                break;
        }


        char ch = 'A';

        switch (ch){
            case 'A':
                System.out.println("key was A");
                break;
            case 'B':
                System.out.println("key was B");
                break;
            case 'C':
                System.out.println("key was C");
                break;
            case 'D':
                System.out.println("key was D");
                break;
            case 'E':
                System.out.println("Key was E");
                break;
            default:
                System.out.println("not found");
                break;
        }

    }
}
