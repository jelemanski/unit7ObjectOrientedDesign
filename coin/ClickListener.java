import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class ClickListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClickListener implements ActionListener
{
    private String name;
    
    public ClickListener(String buttonName)
    {
        this.name = buttonName;
    }
    
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("Button " + event.getActionCommand() + " was clicked" );
    }
  
}
