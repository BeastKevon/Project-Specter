import java.io.*;
import java.util.*;
/**
 * Main function that runs the menu and connects all classes together
 * 
 * @author (Kevin Sweitzer) 
 * @version (3/21/18)
 */
public class Main
{
    //Defining objects
    private Scanner user;
    private Character chr;
    private Menu menu;
    private Train train;

    //Instance Variables
    private int menuAns;

    public Main()
    {
        //Initialise objects
        user = new Scanner(System.in);
        chr = new Character();
        menu = new Menu();
        train = new Train();

        //Initialise instance variables
        menuAns = 0;
    }//end method

    public void runMenu()
    {
        //Recieves a main menu answer
        menuAns = menu.mainMenu();
    }//end method

    public void runStats()
    {
        //creates stats for a character
        chr.create();
    }//end method

    public void runGame()
    {
        while(true)
        {
            //recieves decision menu answer from
            menuAns = menu.decMenu();

            if(menuAns == 1)
            {
                //recieves training menu answer
                menuAns = menu.trainMenu();
                if(menuAns == 1)
                {
                    //trains with game
                    train.game();
                }//end if
                else if(menuAns == 2)
                {
                    //trains with PC
                    train.pc();
                }//end else-if
                else if(menuAns == 3)
                {
                    //trains with GFuel
                    train.gfuel();
                }//end else-if
                else
                {
                    //trains with Bengay
                    train.bengay();
                }//end else
            }//end if
            else if(menuAns == 9)
            {
                //Quits game
                break;
            }//end else-if
            else
            {
                //Runs stream
                
            }//end else
        }//end while
    }//end method
}//end class
