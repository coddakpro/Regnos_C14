package PAINT;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;

public class Bitmap extends GraphicsConfiguration {

    private static Object Bitmap;

    public static void createBitmap(Object width, int height, Object argb8888) {
    }

    public static void setBitmap(Object bitmap) {
        Bitmap = bitmap;
    }

    @Override
    public GraphicsDevice getDevice() {
        return getGraphicsDevice();
    }

    private static GraphicsDevice getGraphicsDevice() {
        return null;
    }

    @Override
    public ColorModel getColorModel() {
        return null;
    }

    @Override
    public ColorModel getColorModel(int transparency) {
        return null;
    }

    @Override
    public AffineTransform getDefaultTransform() {
        return null;
    }

    @Override
    public AffineTransform getNormalizingTransform() {
        return null;
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    public static class Config {
        public static final Object ARGB_8888 = Bitmap;
    }
}
