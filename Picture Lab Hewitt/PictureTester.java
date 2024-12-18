/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }
  
  public static void testNegate()
  {
      Picture swan = new Picture("swan.jpg");
      swan.explore();
      swan.negate();
      swan.explore();
  }
  
  public static void testGrayscale()
  {
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      temple.grayscale();
      temple.explore();
  }
  
  public static void testFixUnderwater()
  {
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
      Picture motor = new Picture("redMotorcycle.jpg");
      motor.explore();
      motor.mirrorVerticalRightToLeft();
      motor.explore();
  }
  
  public static void testMirrorHorizontal()
  {
      Picture motor = new Picture("redMotorcycle.jpg");
      motor.explore();
      motor.mirrorHorizontal();
      motor.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
      Picture motor = new Picture("redMotorcycle.jpg");
      motor.explore();
      motor.mirrorHorizontalBotToTop();
      motor.explore();
  }
  
  public static void testMirrorDiagonal()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorDiagonal();
      beach.explore();
  }
  
  public static void testMirrorArms()
  {
      Picture snow = new Picture("snowman.jpg");
      snow.explore();
      snow.mirrorArms();
      snow.explore();
  }
  
  public static void testMirrorGull()
  {
      Picture gull = new Picture("seagull.jpg");
      gull.explore();
      gull.mirrorGull();
      gull.explore();
  }
  
  public static void testCopy()
  {
      Picture flower1 = new Picture("flower1.jpg");
      Picture flower2 = new Picture("flower2.jpg");
      Picture canvas = new Picture("640x480.jpg");
      flower1.explore();
      canvas.copy(flower1, 0, 0, 0, 25, 50, 50);
      canvas.explore();
  }
  
  public static void testMyCollage()
  {
      Picture canvas = new Picture("640x480.jpg");
      canvas.myCollage();
      canvas.mirrorVertical();
      canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testKeepOnlyBlue();
    //testNegate();
    //testFixUnderwater();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testMirrorArms();
  }
  
  
}