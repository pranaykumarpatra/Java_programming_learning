public class WhileAndDoStatement {
    public static void main(String[] args) {
        int count =1;
        while (count!= 6){
            System.out.println(count);
            count++;
        }
        for (count=1;count!=6;count++){
            System.out.println(count);
        }

        count=1;
        while (true){
            if (count==6){
                break;

            }
            System.out.println(count);
            count++;

        }
        count=0;
        do {
            System.out.println(count);
            count++;
        }while (count!=6);
    }

}
