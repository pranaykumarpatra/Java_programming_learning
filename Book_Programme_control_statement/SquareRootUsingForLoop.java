public class SquareRootUsingForLoop {
    public static void main(String[] args) {
        Print();

    }
    public static void Print(){
        double squareRoot, number;
        for (number=1; number<200 ; number++) {
            squareRoot = Math.sqrt(number);
            System.out.println(" The square root of " + number + " = " + squareRoot);

            squareRoot = Math.round(squareRoot);
            System.out.println(" the integer value of square root is " + squareRoot);

        }
    }
}
