import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
   private JFrame frame;
   private static final int WIDTH = 400;
   private static final int HEIGHT = 400;
   private ControlPanel controls;
   private DrawingPanel canvas;
 public DrawingEditor()
 {
    canvas = new DrawingPanel(); 
    controls = new ControlPanel();
    this.setLayout(new BorderLayout());
    this.add(controls,BorderLayout.SOUTH);
    
 }
    
 public static void main(String[] args)
 {
     DrawingEditor draw = new DrawingEditor();
 }

}
