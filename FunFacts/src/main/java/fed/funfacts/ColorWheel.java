package fed.funfacts;

/**
 * Created by fed on 1/10/2015.
 */
public class ColorWheel {

    // MEMBER VARIABLES
    public int[] mColorList = {

            0xff53bbb4,
            0xff838cc7,
            0xffc25975,
            0xff51b46d,
            0xffe0ab18,
            0xff39add1,
            0xffe15258,
            0xff637a91,
            0xff7d669e,
            0xfff9845b
    };

    // METHODS
    public int getColor(int randomNumber){

        return mColorList[randomNumber];

    }
}
