//Pane Elenovski
//11/10/2017
//Shepard Fairey Lab

import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *
     */
    public static void main(String[] args)
    {


        //opens selfie picture
         /**/
        //String fileName = FileChooser.pickAFile("images\\mypic.jpg");
        Picture pictObj = new Picture("images\\mypic.jpg");

        //relative path
        //change with selfie picture
        Picture original = new Picture("images/mypic.jpg");
        Picture me = new Picture("images/mypic.jpg");
        Picture me1 = new Picture("images/mypic.jpg");
        Picture me2 = new Picture("images/mypic.jpg");

        Pixel[] pixels;
        original.explore();

        /**
         * method 1 change
         *
         */

        pixels = me.getPixels();

        for (Pixel object : pixels)
        {
            int redValue = object.getRed();
            int greenValue = object.getGreen();
            int blueValue = object.getBlue();

            int avg = (redValue+greenValue+blueValue)/3;

            //dark blue color
            if (avg <= 64)
            {
                object.setColor(new Color(10,1,41));
            }
            //red color
            else if (avg <= 128)
            {
                object.setColor(Color.red);
            }
            //light blue color
            else if (avg <= 198)
            {
                object.setColor(new Color(117,106,155));
            }
            //slightly off white color
            else
            {
                object.setColor(new Color(192,190,199));
            }
        }
        me.explore();



        /**
         * method 2 change
         *
         */

        pixels = me1.getPixels();
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (Pixel object : pixels)
        {
            int redValue = object.getRed();
            int greenValue = object.getGreen();
            int blueValue = object.getBlue();
            int avg = (redValue+greenValue+blueValue)/3;

            if (avg < minimum)
            {
                minimum = avg;
            }

            if (avg > maximum)
            {
                maximum = avg;
            }
        }

        for (Pixel object : pixels)
        {
            int redValue = object.getRed();
            int greenValue = object.getGreen();
            int blueValue = object.getBlue();
            int avg = (redValue+greenValue+blueValue)/3;

            //dark blue color
            if (avg >= minimum && avg < ((maximum-minimum)/4))
            {
                object.setColor(new Color(10,1,41));
            }
            //red color
            else if (avg >= ((maximum-minimum)/4) && avg < ((maximum-minimum)/4)*2)
            {
                object.setColor(Color.red);
            }
            //light blue color
            else if (avg>= (((maximum-minimum)/4)*2) && avg < (((maximum-minimum)/4)*3))
            {
                object.setColor(new Color(117,106,155));
            }
            //slighlty off white color
            else
            {
                object.setColor(new Color(192,190,199));
            }

        }
        me1.explore();



        /**
         * custom color palette
         */

        pixels = me2.getPixels();
        
        minimum = Integer.MAX_VALUE;
        maximum = Integer.MIN_VALUE;
        
        for (Pixel object : pixels)
        {
            int redValue = object.getRed();
            int greenValue = object.getGreen();
            int blueValue = object.getBlue();
            int avg = (redValue+greenValue+blueValue)/3;

            if (avg < minimum)
            {
                minimum = avg;
            }

            if (avg > maximum)
            {
                maximum = avg;
            }

        }

        for (Pixel object : pixels)
        {
            int redValue = object.getRed();
            int greenValue = object.getGreen();
            int blueValue = object.getBlue();
            int avg = (redValue+greenValue+blueValue)/3;
            //dark blue color
            if (avg >= minimum && avg < ((maximum-minimum)/4))
            {
                object.setColor(new Color(10,1,41));
            }
            //orange color
            else if (avg >= ((maximum-minimum)/4) && avg < ((maximum-minimum)/4)*2)
            {
                object.setColor(new Color(255,113,0));
            }
            //brown color
            else if (avg>= ( ((maximum-minimum)/4)*2) && avg < (((maximum-minimum)/4)*3))
            {
                object.setColor(new Color(129,80,41));
            }
            //slightly off white color
            else
            {
                object.setColor(new Color(192,190,199));
            }

        }

        for (Pixel object : pixels)
        {
            int redValue = object.getRed();
            object.setRed(redValue*2);

            int blueValue = object.getBlue();
            object.setBlue(blueValue*2);

            int greenValue = object.getGreen();
            object.setGreen(greenValue*2);
        }
        me2.explore();

        me.write("images/mypic1.jpg");
        me1.write("images/mypic2.jpg");
        me2.write("images/mypic3.jpg");



    }//main
}//class