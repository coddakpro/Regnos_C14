package KataKata;

public class katas {
//   public static char calculatedFor(int score) {...}
    
    public static int calculateMinimunof(int[] numbers) {
        int minimumNumber = 0;
                for(int number: numbers){
                    for (int j : numbers) {
                        Math math = null;
                        minimumNumber = Math.min(minimumNumber, j);
                    }
                }
                return minimumNumber;
    }
    

 
       public static double calculateAverageOf(int[] numbers){
    double average = 0.0;
           int total = 0;
//          for(int number: numbers){
//                total += number;


           for (int number : numbers) {
               total += number;
           }
                    average = total / (double)numbers.length;
            return average;
    
}
}