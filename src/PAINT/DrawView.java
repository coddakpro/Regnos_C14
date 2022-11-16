package PAINT;


import javax.naming.Context;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.View;
import java.awt.*;
import java.nio.file.Path;

import static java.awt.Color.lightGray;

public class DrawView extends View {

    static final float Touch_TOLERANCE = 4;
    private static final Object STROKES = Touch_TOLERANCE;
    private static final Object Context = 0;
    private static final Object ROUND = Context;
    private float mX, mY;

    //    tye paint class encapsulates the color
//    and styles information about
//    how to draw the geometries,text and bitmaps
    private paint mPaint;

    private Bitmap mBitmap;
    private final
    paint mBitmapPaint = new paint();

    //    constructors to initialize all the attributes
    private DrawView(Context context) {
        this((javax.naming.Context) Context, null, (Path) ROUND);
    }

    private DrawView(Context context, AttributeSet attrs, Path mPath) {
        super((Element) attrs);
        mPaint = new paint();

//        the below methods smoothens
//        the drawings of the user
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(lightGray);
        mPaint.setStyle(STROKES);
        mPaint.setStrokeCap(PAINT.paint.Cap.ROUND);
        mPaint.setStrokeCap(PAINT.paint.Cap.ROUND);

//        0xff=255 in decimal
        mPaint.setAlpha(0xff);

    }

//    this method instantiate the  bitmap and object
    public  void init(int height, int strokeWidth) {
        Object width = new Object();
        Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas mCanvas = new Canvas(mBitmap);

//        set an initial color of the brush
        Color color = null;
        Object color1 = lightGray;

//        set an initial Brush size
        strokeWidth = 20;
    }

    //    set the stroke width
    public void setStrokeWidth(int width) {
    }

    @Override
    public float getPreferredSpan(int axis) {
        return 0;
    }

    @Override
    public void paint(Graphics g, Shape allocation) {

    }

    @Override
    public Shape modelToView(int pos, Shape a, Position.Bias b) {
        return null;
    }

    @Override
    public int viewToModel(float x, float y, Shape a, Position.Bias[] biasReturn) {
        return 0;
    }

    private class paint {
        public static Object Cap;

        public void setStyle(Object strokes) {

        }

        public void setDither(boolean b) {
        }

        public void setAntiAlias(boolean b) {
        }

        public void setAlpha(int i) {
        }

        public void setColor(Color lightGray) {
        }

        public void setStrokeCap(Object round) {
        }
    }
}
