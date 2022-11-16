package tdd;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;


class TestDrillerUTME {
    @Test
    public  void firstSetOfCopiesTest() {
        tdd.drillerUtme copies = new tdd.drillerUtme();
        int firstSet = copies.CalculateTotalPriceOf(1);
        assertEquals(2_000,firstSet);
    }

    @Test
    public  void secondSetOfCopiesTest() {
        tdd.drillerUtme copies = new tdd.drillerUtme();
        int secondSet = copies.CalculateTotalPriceOf(5);
        assertEquals(9_000,secondSet);
    }

    @Test
    public  void thirdSetOfCopiesTest() {
        tdd.drillerUtme copies = new tdd.drillerUtme();
        int thirdSet = copies.CalculateTotalPriceOf(10);
        assertEquals(16_000,thirdSet);
    }

    @Test
    public  void fourthSetOfCopiesTest() {
        tdd.drillerUtme copies = new tdd.drillerUtme();
        int fourthSet = copies.CalculateTotalPriceOf(30);
        assertEquals(45_000,fourthSet);
    }

    @Test
    public  void fifthSetOfCopiesTest() {
        tdd.drillerUtme copies = new tdd.drillerUtme();
        int fifthSet = copies.CalculateTotalPriceOf(50);
        assertEquals(65_000,fifthSet);
    }

    @Test
    public  void sixthSetOfCopiesTest() {
        tdd.drillerUtme copies = new tdd.drillerUtme();
        int sixthSet = copies.CalculateTotalPriceOf(100);
        assertEquals(65_000,sixthSet);
    }

    @Test
    public  void sevenSetOfCopiesTest() {
        tdd.drillerUtme copies = new tdd.drillerUtme();
        int seventhSet = copies.CalculateTotalPriceOf(200);
        assertEquals(20_0000,220_000,seventhSet);
    }

    @Test
    public  void eighthSetOfCopiesTest() {
        tdd.drillerUtme copies = new tdd.drillerUtme();
        int eightSet = copies.CalculateTotalPriceOf(500);
        assertEquals(500_000,eightSet);
    }

}
