public class ParsingValueFromAString {
    public static void main(String[] args) {
        String numberAsString = "2018";
        String booleanValue = "true";
        System.out.println(numberAsString);
        int number = Integer.parseInt(numberAsString); // string to integer
        System.out.println(number);
        double number2= Double.parseDouble(numberAsString);// string to double
        System.out.println(number2);
        if (Boolean.parseBoolean(booleanValue) ){ // string to boolean
            System.out.println(booleanValue);
        }

        numberAsString += 1; // here the 1 will be added next to 2018 as 20181
        number +=1;// here after converting string to number so that it will do 2018+1-> 2019
        System.out.println(numberAsString + "    " + number);
    }
}
