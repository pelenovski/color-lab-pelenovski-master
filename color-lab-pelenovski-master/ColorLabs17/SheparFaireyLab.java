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
        String fileName = FileChooser.pickAFile("images\\mypic.jpeg");
        Picture pictObj = new Picture("images\\mypic.jpeg");
        pictObj.explore();

        //relative path
        Picture apic = new Picture("images\\mypic.jpeg");
        //change with selfie picture
        Picture original = new Picture("images/mypic.jpeg");
        Picture me = new Picture("images/mypic.jpeg");
        Picture me1 = new Picture("images/mypic.jpeg");
        Picture me2 = new Picture("images/mypic.jpeg");

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
                object.setColor(new Color(25,25,115));
            }
            //red color
            else if (avg <= 128)
            {
                object.setColor(Color.red);
            }
            //light blue color
            else if (avg <= 198)
            {
                object.setColor(new Color(176,196,222));
            }
            //slightly off white color
            else
            {
                object.setColor(new Color(230,230,230));
            }
        }
        me.explore();



        /**
         * method 2 change
         *
         */

        pixels = me1.getPixels();
        int minimum = Integer.MIN_VALUE;
        int maximum = Integer.MAX_VALUE;

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
                object.setColor(new Color(25,25,115));
            }
            //red color
            else if (avg >= ((maximum-minimum)/4) && avg < ((maximum-minimum)/4)*2)
            {
                object.setColor(Color.red);
            }
            //light blue color
            else if (average>= (((maximum-minimum)/4)*2) && average < (((maximum-minimum)/4)*3))
            {
                object.setColor(new Color(176,196,222));
            }
            //slighlty off white color
            else
            {
                object.setColor(new Color(230,230,230));
            }

        }
        me1.explore();



        /**
         * custom color palette
         */

        pixels = me2.getPixels();

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

            if (avg >= minimum && avg < ((maximum-minimum)/4))
            {
                object.setColor(new Color(25,25,115));
            }
            //orange color
            else if (avg >= ((maximum-minimum)/4) && avg < ((maximum-minimum)/4)*2)
            {
                object.setColor(new Color(255,215,0));
            }
            //brown color
            else if (avg>= ( ((maximum-minimum)/4)*2) && avg < (((maximum-minimum)/4)*3))
            {
                object.setColor(new Color(255,69,0));
            }
            //slightly off white color
            else
            {
                object.setColor(new Color(230,230,230));
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





    }//main
}//class
