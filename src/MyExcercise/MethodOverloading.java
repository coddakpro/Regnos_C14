package MyExcercise;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Eric", 500);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "Scored " + score + "Points");
        return score * 1000;

    }


    }

