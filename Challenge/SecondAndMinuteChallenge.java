public class SecondAndMinuteChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {

        long seconds = 3945;
        System.out.println(getDurationString(seconds));
        System.out.println(getDurationString(76,65));

    }

    private static String getDurationString(long minutes,long seconds){
        if((minutes < 0) || (seconds < 0) & (seconds > 59) ) {

            return INVALID_VALUE_MESSAGE;
        }else {

            long hours= minutes/60;
            long remainingMinutes = minutes%60;

            String hoursString = hours + "h";
            if (hours<10){
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m";
            if (minutes<10){
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds<10) {
                secondsString = "0" + secondsString;
            }
            return hoursString +" " + minutesString + " " + secondsString + " ";


    }

    }
    private static String getDurationString(long seconds){


        if (seconds<0){
            return INVALID_VALUE_MESSAGE;
        } else {

            long minutes = seconds/60;
            long remainingSeconds = seconds % 60;
            System.out.println();
            return getDurationString(minutes,remainingSeconds);

        }

    }
}
