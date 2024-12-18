
/**
 * The turtle project!
 *
 * @author Gavin Hewitt
 * @version 05/10/21
 */
import java.util.*;
import galapagos.*;
import java.awt.*;

public class TurtleProject
{
    public static void main(String[] args)
    {
        TurtleDrawingWindow canvas = new TurtleDrawingWindow();
        canvas.setVisible(true);
        
        Turtle jimbob = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        canvas.add(jimbob);
        //draws the sky
        Turtle billyjoel = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        canvas.add(billyjoel);
        //draws the sand
        Turtle carlweezer = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        canvas.add(carlweezer);
        //draws the ocean
        Turtle boburnham = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        canvas.add(boburnham);
        
        boburnham.penColor(Color.BLUE);
        boburnham.penSize(100);
        boburnham.jumpTo(-200, -50);
        boburnham.forward(400);
        
        boburnham.penColor(Color.BLACK);
        boburnham.penSize(3);
        boburnham.speed(500);
        
        //loops to draw "waves"
        int x = -190;
        for(int i = 0; i < 9; i++)
        {
            boburnham.jumpTo(x, ((Math.random() * 20) - 60));
            boburnham.heading(0);
            for(int j = 0; j < 10; j++)
            {
                boburnham.forward(3);
                boburnham.turn(5);
            }
            for(int k = 0; k < 10; k++)
            {
                boburnham.turn(-5);
                boburnham.forward(3);
            }
            boburnham.heading(270);
            for(int l = 0; l < 10; l++)
            {
                boburnham.forward(3);
                boburnham.turn(-5);
            }
            x += 45;
        }
        
        carlweezer.penColor(new Color(237, 230, 168));
        carlweezer.penSize(150);
        carlweezer.jumpTo(-200, -125);
        carlweezer.forward(400);
        
        carlweezer.penColor(new Color(156, 115, 72));
        
        billyjoel.penColor(new Color(135, 206, 235));
        billyjoel.penSize(500);
        billyjoel.jumpTo(-200, 100);
        billyjoel.forward(300);
        
        billyjoel.penColor(Color.YELLOW);
        billyjoel.penSize(10);
        billyjoel.jumpTo(-150,75);
        billyjoel.speed(100);
        //loops to make a circle
        for(int i = 0; i < 36; i++)
        {
            billyjoel.forward(25);
            billyjoel.jumpTo(-150,75);
            billyjoel.turn(10);
        }
        
    }
}
