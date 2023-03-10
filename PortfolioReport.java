import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program creates a portfolio by reading the transactions in
 * the file transactions.txt and buying and selling stock shares
 * accordingly.  Then, this program prints the portfolio report
 * as described in the problem set 2 instructions.
 *
 * @author Tabitha Henriquez
 * @version Spring 2023
 */
public class PortfolioReport
{
    /**
     * This program creates a portfolio by reading the transactions in
     * the file transactions.txt and buying and selling stock shares
     * accordingly.  Then, this program prints the portfolio report
     * as described in the problem set 2 instructions.
     * 
     * @param args No command line arguments required.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("transactions.txt"));        
        Portfolio p = new Portfolio();

        while(file.hasNext()){
            String line = file.nextLine();
            String[] data = line.split(",");
            if(data[0].equals("B")){
                //Buy the stock from the portfolio.
                numShares++;
            } else {
                //Sell the stock from the portfolio.
                numShares--;
            }
        }

        System.out.print(p);
        System.out.println();
        
        // Uncomment the lines of code below and complete the print statements to work as intended.
        System.out.println(String.format("      Current Value:  $%,15.2f", p.getCurrentValue()));
        System.out.println(String.format("Lifetime Investment:  $%,15.2f", p.getLifeInvest()));
        System.out.println(String.format("    Lifetime Payout:  $%,15.2f", p.getLifePayout()));
    }
}
