package MyExcercise;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 10000;
            System.out.println("score " + finalScore);
        }

        boolean newGameOver = true;
        int newScore = 1000;
        int newLevelCompleted = 5;
        int newBonus = 100;

if (newGameOver){
    int finalScore = newScore + (newLevelCompleted * newBonus);
    System.out.println("your final score was " + finalScore);
}


    }
}
