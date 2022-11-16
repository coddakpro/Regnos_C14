package PAINT.Style;

import java.nio.file.Path;

public class STROKES {
    public static void main(String[] args) {

    }

//    color of the stroke
    public int color;

//    width of the stroke
    public int strokeWidth;

//    a path object to
//    represent the path drawn
    public Path path;

//    constructor to initialise the attributes
    public void Stroke(int color, int strokeWidth, Path path) {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
