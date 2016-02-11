import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Write a program that allows the user to specify a triangle with three mouse presses.
After the first mouse press, draw a small dot. After the second mouse press, draw a
line joining the first two points. After the third mouse press, draw the entire triangle.
The fourth mouse press erases the old triangle and starts a new one.
 */
public class Triangle extends JComponent
{

    private Rectangle point;
    
    public void TriangleComponent()
    {
        point = new );
        
    }
    
    public void pointComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g ;
        g2.draw(point);
        
    }
    
    public void placePoint()
    {
        
    }
    

}
