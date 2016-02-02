import java.awt.Rectangle;

/**
 * Write a description of class BetterRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetterRectangle extends Rectangle
{
    
    public BetterRectangle()
    {
       this.setLocation();
       this.setSize();
    }

   
    public int getPerimeter()
    {
        int perimeter = this.getWidth()*2+this.getHeight*2;
        return perimeter;        
    }
    
    public int getArea()
    {
        int area = this.getWidth*this.getHeight;
        return area;
    }

}
