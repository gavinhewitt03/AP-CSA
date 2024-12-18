
 /**
  * Playing around with turtle methods.
  *
  * @author Gavin Hewitt 
  * @version 05/10/21
  */
 import galapagos.*;
 import java.awt.*;
 public class PlayTurtle
 {
    public static void main(String[] args)
    {
        Turtle joe = new Turtle();
        
        joe.speed(500);
        joe.penColor(Color.RED);
        joe.penSize(5);
        joe.forward(100);
    }
 }
