import java.util.*;
/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train
{
    final private int GAME_BUILD_INC = 2;
    final private int GAME_AIM_INC = 2;
    final private int PC_INC = 10;
    final private int GFUEL_BUILD_INC = 10;
    final private int BENGAY_AIM_INC = 10;
    
    Character chr;
    Scanner user;
    
    public Train()
    {
        chr = new Character();
        user = new Scanner(System.in);
    }
    
    public void game()
    {
        System.out.print("\f");
        
        chr.setBuild(GAME_BUILD_INC);
        chr.setAim(GAME_BUILD_INC);
        
        chr.displayStats();
        System.out.println("Press Enter...");
        user.nextLine();
    }
    
    public void pc()
    {
        System.out.print("\f");
    }
    
    public void gfuel()
    {
        System.out.print("\f");
    }
    
    public void bengay()
    {
        System.out.print("\f");
    }
}
