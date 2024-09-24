import mayflower.*;
/**
 * Write a description of class MyMayflower here.
 *
 * @author Sohum Tambe
 * @version (a version number or a date)
 * Period 3
 */
public class MyMayflower extends Mayflower
{
  
    /**
     * Constructor for objects of class MyMayflower
     */
    public MyMayflower()
    {
       super("Lab 1", 800, 600);
    }
    
    public void init(){
        Mayflower.setFullScreen(false);
        
        World w = new MyWorld();
        Mayflower.setWorld(w);
    }

   
}
