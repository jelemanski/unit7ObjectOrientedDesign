import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;


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
public class TriangleFrame extends JFrame
  {  
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
 
    
    public void TriangleComponent(Graphics g)
    {
       
        
    }
    
    public void placePoint()
    {
        
    }
    public interface MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
    }
        

}
}
