public class ForStatement {
    public static void main(String[] args) {

        for (double interest =8;interest>=2;interest--){
           double interestAmount = calculateInterest(10000,interest);
            System.out.println("for interest rate = " +  (interest)
                    + " the interest will be = Rs. " + String.format("%.2f",interestAmount));
        }

        int count =0;
        for (int i=10;i<5000;i++){
            if (isPrime(i)){
                count++;
                System.out.println("number " + i + " is a prime number");
                if (count==100){
                    System.out.println("exit the loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static boolean isPrime (int n){

        if (n==1){
            return false;
        }
        for (int i = 2;i <= Math.sqrt(n); i ++){
            if (n % i == 0){
                return false;
            }

        }return true;

    }
}
