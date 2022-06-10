public class DoWhileAdvanced {
    public static void main(String[] args) {
        int number=4;
        int finalNumber=29;
        int count=0;

        while (number<finalNumber){
            number++;
            if (!isEvenNumber(number)){
                continue; // if, the if statement is false it will bypass print statement for continue.
            }else
                count++;
                System.out.println(number);
            if (count==5) {
                break;
            }
        }
        System.out.println(count);
    }
    public static boolean isEvenNumber(double number){

        return number%2==0;

    }
}
