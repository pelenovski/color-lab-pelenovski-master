
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
      Color sample = new Color(255, 51, 0);
      Color sample2 = Color.orange;
      
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS-Java\chap03\Curriclum2013\PictureColorlabs\images\\beach.jpg");
     
     //relative path
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris2 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");

     apic.explore();
     ferris1.explore();
     
     //makes an array of pixels
     Pixel[] pixels_arr;
     //gets pixels from picture and assigns to pixels array
     pixels_arr = ferris1.getPixels();
    int i = 0;
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );


    /**/
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);

    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();

   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot1 : pixels)
    {
        //System.out.println( spot1 );
        if ((spot1.getX()+ spot1.getY())% 20 == 0)
        {
            spot1.setColor(Color.green);
        }
        i++;
    }
    ferris1.explore();
   
 /**/

 /**/
  //* Method to clear red from picture
 // * @param none
  //* @return none
 // */
 
    for (Pixel pixelObj : pixels)
        {
            pixelObj.setRed(0);
        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */


int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getBlue();
        //System.out.println(value);
        factoredvalue = value*FACTOR;
        //decrease the red value by 50%
        value = factoredvalue;
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file after any changes
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
