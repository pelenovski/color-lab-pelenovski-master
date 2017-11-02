//Pane Elenovski
//11/1/2017
//ColorLab
//Do stuff to a picture

import java.awt.*;
import java.util.*;
import java.util.List;

public class ColorLab
{
    public static void main(String[] args)
    {
        Picture pic = new Picture("images\\thepic.jpg");
        pic.explore();
        Picture pic1 = new Picture("images\\thepic.jpg");
        Picture pic2 = new Picture("images\\thepic.jpg");

        Pixel[] pixels;
        pixels = pic1.getPixels();

        for (Pixel spot: pixels)
			spot.setBlue(255);

		pic1.explore();

		pixels = pic2.getPixels();










    }
}
