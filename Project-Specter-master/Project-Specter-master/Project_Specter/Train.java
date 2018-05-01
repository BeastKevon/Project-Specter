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

    final private int PC_COST = -500;
    final private int GFUEL_COST = -100;
    final private int BENGAY_COST = -100;

    private int balance;

    Character chr;
    Scanner user;

    public Train()
    {
        chr = new Character();
        user = new Scanner(System.in);

        balance = 0;
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

        if(chr.setMoney(PC_COST))
        {
            chr.setPC(PC_INC);
            chr.displayStats();
        }

        
        System.out.println("Press Enter...");
        user.nextLine();
    }

    public void gfuel()
    {
        System.out.print("\f");

        if(chr.setMoney(GFUEL_COST))
        {
            chr.setBuild(GFUEL_BUILD_INC);
            chr.displayStats();
        }

        
        System.out.println("Press Enter...");
        user.nextLine();
    }

    public void bengay()
    {
        System.out.print("\f");

        if(chr.setMoney(BENGAY_COST))
        {
            chr.setAim(BENGAY_AIM_INC);
            chr.displayStats();
        }

        
        System.out.println("Press Enter...");
        user.nextLine();
    }
}
