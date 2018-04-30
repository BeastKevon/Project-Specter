import java.util.*;
/**
 * Write a description of class Character here.
 * 
 * @author (Kevin Sweitzer) 
 * @version (a version number or a date)
 */
public class Character
{
    private Random rand;
    private Scanner user;

    private int rNum;

    private int menuAns;
   
    private static int myBuild;
    private static int myAim;
    private static int myPC;
    private static int myStream;
    private static int myMoney;
    
    private static String name;
    public Character()
    {
        rand = new Random();
        user = new Scanner(System.in);

        myBuild = 0;
        myAim = 0;
        myPC = 0;
        myStream = 0;
        myMoney = 100;
    }
    
    public void create()
    {
        name();
        rollStats();
    }
    
    private void name()
    {
        System.out.print("Character Name: ");
        name = user.nextLine();
        System.out.print("\f");
    }
    
    private void rollStats()
    {
        rollBuild();
        rollAim();
        rollPC();
        rollStream();
        
        initDisplayStats();
    }
    
    private void rollBuild()
    {
        myBuild = getRand();
    }

    private void rollAim()
    {
        myAim = getRand();
    }

    private void rollPC()
    {
        myPC = getRand();
    }

    private void rollStream()
    {
        myStream = getRand();
    }
    
    private int getRand()
    {
        rNum = rand.nextInt(3) + 1;

        return rNum;
    }
    
    private void initDisplayStats()
    {
        System.out.println("                STATS (1 to 100)");
        System.out.println("");
        System.out.println("BUILDING        - skill and efficiency in CQC and ambushing");
        System.out.println("AIMING          - accuracy at distance");
        System.out.println("PC              - skills in self care and staying alive");
        System.out.println("STREAM          - effective at avoiding others and more aware of surroundings");

        System.out.println("");

        System.out.println("");
        System.out.println("       YOUR INITIAL STATS FOR " + name);
        System.out.println("");
        System.out.println("BUILDING        - " + myBuild);
        System.out.println("AIMING          - " + myAim);
        System.out.println("PC              - " + myPC);
        System.out.println("STREAM          - " + myStream);
        System.out.println("MONEY          - $" + myMoney);
        
        System.out.print("Press Enter to Continue...");
        user.nextLine();
    }
    
    public void displayStats()
    {
        System.out.println("                STATS (1 to 100)");
        System.out.println("");
        System.out.println("BUILDING        - skill and efficiency in CQC and ambushing");
        System.out.println("AIMING          - accuracy at distance");
        System.out.println("PC              - skills in self care and staying alive");
        System.out.println("STREAM          - effective at avoiding others and more aware of surroundings");

        System.out.println("");

        System.out.println("");
        System.out.println("       YOUR STATS FOR " + name);
        System.out.println("");
        System.out.println("BUILDING        - " + myBuild);
        System.out.println("AIMING          - " + myAim);
        System.out.println("PC              - " + myPC);
        System.out.println("STREAM          - " + myStream);
        System.out.println("MONEY          - $" + myMoney);
    }
    
    public void setBuild(int num)
    {
        myBuild += num;
    }
    public void setAim(int num)
    {
        myAim += num;
    }
    public void setPC(int num)
    {
        myPC += num;
    }
    public void setStream(int num)
    {
        myStream += num;
    }
    public void setMoney(int num)
    {
        myMoney += num;
    }
    
    public int getBuild()
    {
        return myBuild;
    }
    public int getAim()
    {
        return myAim;
    }
    public int getPC()
    {
        return myPC;
    }
    public int getStream()
    {
        return myStream;
    }
    public int getMoney()
    {
        return myMoney;
    }
    public String getName()
    {
        return name;
    }
}
