package MyExcercise;

public class CalculateScore {

    public static void main(String[] args) {
        int newScore = calculateScore("jesus", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " score" + " points");
        return score * 1000;

    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player score" + " points");
        return score * 1000;
    }

    public  static  int calculateScore() {
        System.out.println("no player name, no player score.");
        return 0;
    }
}
