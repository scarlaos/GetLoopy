import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        Random rnd =  new Random();
        String continueYN = "";
        int die1 = 0, die2 = 0,die3 = 0, dieRoll;

        do
        {
            int roll = 0;
            System.out.println("Roll Die1 Die2 Die3   Sum ");
            System.out.println("----------------------------");
            do
            {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6)+1;
                die3 = rnd.nextInt(6)+1;
                dieRoll = die1 + die2 + die3;
                roll++;

                System.out.printf("%3d  %3d  %3d  %3d  %5d\n",roll, die1, die2, die3, dieRoll);
            } while(die1 != die2 || die1 != die3);
            System.out.println("----------------------------");
            System.out.println("Enter any key to roll again, or type 'exit' to quit");
            continueYN = in.nextLine();

        } while(!continueYN.equalsIgnoreCase("exit"));
    }
}
