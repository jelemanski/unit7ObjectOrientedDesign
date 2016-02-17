import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Write a description of class TriangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private JFrame frame;
    private JPanel panel;
    private point[][];
    public void setPoint()
    {
        if(count ==1)
        {
            point =[x1,y1]
        }
        if(count == 2)
        {
            point =[x2,y2]
        }
         if(count == 3)
        {
            point =[x3,y3]
        }
    }
    
    public void pointComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point)
    }
    

 

}
