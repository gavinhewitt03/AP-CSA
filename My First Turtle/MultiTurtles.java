
/**
 * How to add multple turtles to a playground.
 *
 * @author Gavin Hewitt
 * @version 05/11/21
 */
import galapagos.*;
import java.awt.*;
public class MultiTurtles
{
    public static void main(String[] args)
    {
        //Creates and displays custom playground object
        TurtleDrawingWindow myPlayground = new TurtleDrawingWindow();
        myPlayground.setVisible(true);
        
        //Creates and adds turtle for background
        Turtle elle = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        myPlayground.add(elle);
        Turtle eye = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        myPlayground.add(eye);
        
        elle.speed(500);
        elle.jumpTo(-150,100);
        elle.heading(-90);
        elle.forward(100);
        
        eye.speed(500);
        eye.penColor(Color.MAGENTA);
        eye.jumpTo(-50,100);
        eye.moveTo(-50, 0);
    }
}
