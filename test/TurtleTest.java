import MyExcercise.Turtle;
import TurtleGraphics.pen;
import org.testng.annotations.Test;

import static javax.swing.SwingConstants.EAST;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertSame;

public class TurtleTest {
    Turtle ijapa;
    private Object penStata;


    @Test
    public  void  turtleExistTest(){
        Turtle ijapa =  new Turtle();
        assertNotNull(ijapa);

    }
    @Test
    public void turtleHasAPenTest(){
        pen pen = ijapa.getPen();
        assertNotNull(pen);

    }
    @Test
    public  void turtleCTurnRight_WhileFaceEasttest(){
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), EAST );
//        when
        ijapa.turnRight();
    }
}
