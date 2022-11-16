package TurtleGraphics;

public class Turtle<Direction> {
    private pen biro;

    {
        setBiro(getBiro());
    }

    private int currentDirection;
    public pen getPen() {
        return getBiro();
    }
    public void penDown(){
        Object Up = new Object();
        getBiro().setState(Up);
    }

    {
        direction Down = null;
        getBiro().getState(Down);
    }
    public void penUp(){}

    public direction getCurrentDirection(){
        Direction Direction = null;
        Direction direction = (null);
        return null;

    }

    private void face(int direction){
        currentDirection = direction;
    }

    public pen getBiro() {
        return biro;
    }

    public void setBiro(pen biro) {
        this.biro = biro;
    }
}
