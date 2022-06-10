public class SpeedConvertor {
    public static void main(String[] args) {

    }
public static double milesToKilometer(double KilometerPerHour){
    if(KilometerPerHour < 0){
        return -1;
    }
    return (KilometerPerHour/2);
}

public static void PrintResult(double KilometerPerHour){
    if(KilometerPerHour < 0){
        System.out.println("INVALID INPUT");
    } else{
        double milesPerHour =  milesToKilometer(KilometerPerHour);
        System.out.println(milesPerHour + " miles/hr = " + KilometerPerHour + " Km/hr" );
    }
}
}
