package PAINT;

import java.awt.*;

interface Paint extends Transparency {

    Object DITHER_FLAG = TRANSLUCENT;
    Object ColorModel = new Object();
    Object Transparency = DITHER_FLAG;


    @Override
    int getTransparency();

    ;

}


