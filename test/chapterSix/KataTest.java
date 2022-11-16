package chapterSix;

import KataKata.katas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

   public class KataTest {

       private Object kata;
       private Integer result;

       @Test
        public void aGradeCanBeCalculatedTest (){
           Katas gradeSomething = new Katas();

        char result = 0;
            gradeSomething.calculateGradeFor(90);
            assertEquals('A', result);

        }
        @Test
        public void bGradeCanBeCalculatedTest(){
      Katas gradeSomething = new Katas();
        char result = gradeSomething.calculateGradeFor(80);
            char myResult;
            assertEquals('B',result);
        }


   @Test
       public void cGradeCanBeCalculatedTest(){
          Katas gradeSomething = new Katas();
           char result = gradeSomething.calculateGradeFor(70);
           assertEquals('C',result);
       }
       @Test
       public void dGradeCanBeCalculatedTest(){
           Katas gradeSomething = new Katas();
           char result = gradeSomething.calculateGradeFor(60);
           assertEquals('D',result);
       }
       @Test

        public void arrayMinimumCanBeCalculatedTest(){
            int [] numbers = {1,2,3,4,5};
            int result = Katas.calculateMinimumOf(numbers);
            assertEquals(1, result);
       }

       @Test

       public  void arrayMaximumCanBeCalculatedTest(){
           katas kata;
           kata = new katas();
           int[] numbers = {1,2,3,4,5};
            assertEquals(5, result);
       }

       @Test
       public void arrayAverageCanBeCalculated(){
           double [] numbers = {1,2,3,4,5};
            assertEquals(3, result);
       }
       @Test

       public void arrayTotalCanBeCalculatedTest(){
           katas totalSomething = new katas();
            int [] numbers = {1,2,3,4,5};
            int result = 0;
           assertEquals(15, result);
       }

       private static class Katas {
           public static int calculateMinimumOf(int[] numbers) {

               return 0;
           }

           public char calculateGradeFor(int i) {


               return 0;
           }

           private static class katas {
       }
       }
   }


