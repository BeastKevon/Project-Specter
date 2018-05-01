import java.util.*;
/**
 * Write a description of class Stream here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stream
{
    Random rand;
    
    private int rNum;
    
    public Stream()
    {
        rand = new Random();
        
        rNum = 0;
    }
    
    public void runStream()
    {
        
    }
    
    private int game()
    {
        rNum = rand.nextInt(3) + 1;

        return rNum;
    }
}
