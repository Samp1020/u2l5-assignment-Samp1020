import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        //variables
        double tRate;
        int nBoards;
        int nWindows;

        //scanner
        Scanner scan = new Scanner(System.in);

        //user input
        System.out.println("Enter the sales tax rate: ");
        tRate = scan.nextDouble();
        System.out.print("How many boards do you need? ");
        nBoards = scan.nextInt();
        System.out.println("How many windows do you need? ");
        nWindows = scan.nextInt();

        //the math behind the code 
        Construction theConstruction = new Construction(5.0, 11.0, tRate);
        double theTotal = theConstruction.lumberCost(nBoards) + theConstruction.windowCost(nWindows);
        double grandTotal = theConstruction.grandTotal(theTotal);
        System.out.println("Total: " + theTotal);
        System.out.println("The grand total is " + grandTotal);




    }
}
