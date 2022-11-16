package tdd;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.function.BooleanSupplier;

class AcTest {

    Ac lg;

    @BeforeEach
    void startWith(){
        lg = new Ac();
    }
    @Test
    public void checkAcIsOn(){
//        given that I have an Ac
        Ac lg = new Ac();
        lg.turnOn();
        assertTrue(lg.isOn());
    }

    private void assertTrue(BooleanSupplier on) {

    }


}
