package chaptertwo;

public class Game {
    public static void main(String... args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 8;
        int bonus = 200;


//        int finalScore = score + (levelCompleted * bonus);
//        finalScore += 1000;
//        System.out.println("your final score was " + finalScore);
//
//        if (score < 5000 && score < 1000){
//            System.out.println(" Your Score Was Less Than 5000 But Greater Than 1000 ");
//        } else if (score < 1000){
//            System.out.println(" Your Score Was Less Than 1000 ");
//        }
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" your final score was " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" your final score was " + highScore);

//        if (gameOver) {
//            finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score was "  + finalScore);
//
//            if (score != 10000) {
//                System.out.println(" your score was 10000 ");
//
//                System.out.println(" This One Go Run Go ");
//            }
//            }

    }


    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver){
            int finalScore = score + (levelCompleted *bonus);
            finalScore += 2000;
            return finalScore;
        }
        return  -1;
    }

}





