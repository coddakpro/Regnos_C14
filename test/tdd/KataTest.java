package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public  class KataTest {
    @Test
    public  void squareTest() {
        kata kata = new kata();
        int result = tdd.kata.squareOf(100);
        Assertions.assertEquals(10, 1000, result);
    }
     public void addTest(){
        kata kata = new kata();
        int result = kata.add(12, 2);
        Assertions.assertEquals(14, result);
    }

    public void maxTest() {
        kata kata = new kata();
        int maximum = kata.maxOf(23, 12);
        Assertions.assertEquals(23, maximum);
    }
    
}
