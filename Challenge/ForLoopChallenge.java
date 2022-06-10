public class ForLoopChallenge {
    public static void main(String[] args) {
        System.out.println("numbers divided by both 3 and 5");
        int count =0, sum=0;
        for (int i=1;i<=1000;i++){
            if (i%3==0 && i%5==0){
                sum += i;
                count++;
                System.out.print(i + "\t");

            }
            if (count==5){
                break;
            }

        }
        System.out.println("\nThe sum of the numbers are = " + sum);
    }

}
