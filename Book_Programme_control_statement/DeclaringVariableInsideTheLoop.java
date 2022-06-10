public class DeclaringVariableInsideTheLoop {
    public static void main(String[] args) {

        int sum=0;
        int fact = 1;
        for (int i=1; i<=5; i++){
            sum +=i;
            fact *=i;
        }

        //but I is not known here

        System.out.println("SUM IS " + sum);
        System.out.println("Factorial is " + fact);
    }
}
