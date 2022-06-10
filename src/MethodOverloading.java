public class MethodOverloading {
    public static void main(String[] args) {

      int newScore =   CalculateScore("Pranay",600);
        System.out.println("Score = " + newScore);

        CalculateScore(700);
        CalculateScore();

    }

    public static int CalculateScore(String PlayerName, int score){
        System.out.println("Player " + PlayerName + " scored " + score + " points.");
        return score*1000;
    }

    public static int CalculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }
    public static int CalculateScore() {
        System.out.println(" No player name , no score");
        return 0;
    }
}
