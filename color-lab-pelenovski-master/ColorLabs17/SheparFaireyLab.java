
/**
 * Write a description of class SheparFaireyLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();

         //relative path
         Picture apic = new Picture("images\\mypic.jpeg");
         //change with selfie picture
         Picture me = new Picture("images/mypic.jpeg");
         Picture me1 = new Picture("images/mypic.jpeg");
         Picture me2 = new Picture("images/mypic.jpeg");

         /**
          * method 1 change
          *
          */



         /**
          * method 2 change
          *
          */

         /**
          * custom color palette
          */


    }//main
}//class
