import java.io.*;
import java.util.*;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
    private Scanner user;
    private Character chr;

    private int menuAns;

    public Menu()
    {
        user = new Scanner(System.in);
        chr = new Character();

        menuAns = 0;
    }

    public int mainMenu()
    {
        introDisplay();
        mainMenuDisplay();
        return menuAns;
    }
    
    public int decMenu()
    {
        decMenuDisplay();
        return menuAns;
    }
    
    public int trainMenu()
    {
        trainMenuDisplay();
        return menuAns;
    }
    
    private void introDisplay()
    {
        System.out.println("You are an ambitious gamer and your dream is to become a famous streamer. You recently ");
        System.out.println("picked up the game Fortnite and decided to get skilled in the game so you can start streaming");
        System.out.println("right off the bat. You will need to get good before you can make big bank off of streaming. You");
        System.out.println("start off with a toaster computer and are willing to spend effort to become like our lord and");
        System.out.println("savior NINJA.");
        System.out.println("");
        System.out.println("You will be able to play games and will slowly become better off of it. After every game your skill");
        System.out.println("stats will increase slightly and you will make some money depending on how famous you are. ");
        System.out.println("You can spend money to buy products to get better or to show off to your stream.");
        
        System.out.print("Press Enter to Continue...");
        user.nextLine();
        
        System.out.print("\f");
    }

    private void mainMenuDisplay()
    {
        while(true)
        {
            System.out.println("1. Start Character");
            System.out.print("Menu Answer: ");
            menuAns = user.nextInt();

            if(menuAns == 1)
            {
                break;
            }//end if
            else
            {
                System.out.print("\f");
            }//end else
        }//end while
        System.out.print("\f");
    }
    
    private void decMenuDisplay()
    {
        System.out.print("\f");
        while(true)
        {
            System.out.println("1. Train");
            System.out.println("2. Stream");
            System.out.print("Answer: ");
            menuAns = user.nextInt();
            
            if(menuAns == 1)
            {
                break;
            }
            else if(menuAns == 2)
            {
                break;
            }
            else
            {
                System.out.print("\f");
            }
        }
    }
    
    private void trainMenuDisplay()
    {
        System.out.print("\f");
        while(true)
        {
            chr.displayStats();
            
            System.out.println("1. Play a game");
            System.out.println("2. Upgrade PC ($500)");
            System.out.println("3. Buy GFuel ($100)");
            System.out.println("4. Buy Bengay ($100)");
            System.out.print("Answer: ");
            menuAns = user.nextInt();
            
            if(menuAns == 1)
            {
                break;
            }
            else if(menuAns == 2)
            {
                break;
            }
            else if(menuAns == 3)
            {
                break;
            }
            else if(menuAns == 4)
            {
                break;
            }
            else
            {
                System.out.print("\f");
            }
        }
    }
}