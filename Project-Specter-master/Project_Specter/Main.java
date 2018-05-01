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
    //Class Menu Variables
    private int menuAns;

    public Main()
    {
        user = new Scanner(System.in);
        chr = new Character();
        menu = new Menu();
        train = new Train();

        menuAns = 0;
    }//end method

    public void runMenu()
    {
        menuAns = menu.mainMenu();
    }//end method

    public void runStats()
    {
        chr.create();
    }

    public void runGame()
    {
        while(true)
        {
            menuAns = menu.decMenu();

            if(menuAns == 1)
            {
                menuAns = menu.trainMenu();
                if(menuAns == 1)
                {
                    train.game();
                }
                else if(menuAns == 2)
                {
                    train.pc();
                }
                else if(menuAns == 3)
                {
                    train.gfuel();
                }
                else
                {
                    train.bengay();
                }
            }
            else
            {

            }
        }
    }
}//end class
