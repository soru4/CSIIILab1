import mayflower.*;
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Actor
{


    public Cat()
    {
      setImage("img/cat.png");
    }
    
    public void act(){
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT) && x <= 800 - w){
            setLocation(x+1,y);
        }
        if(Mayflower.isKeyDown(Keyboard.KEY_LEFT) && x >= 0){
            setLocation(x-1,y);
        }
         if(Mayflower.isKeyDown(Keyboard.KEY_UP) && y >= 0){
            setLocation(x,y-1);
        }
         if(Mayflower.isKeyDown(Keyboard.KEY_DOWN) && y <= 600 -h){
            setLocation(x,y+1);
      
            
        }
        
        
        
        
    }

   
}
