
/**
 * Write a description of class Portfolio here.
 *
 * @author Tabitha Henriquez
 * @version Spring 2023
 */
public class Portfolio
{
    private int stocksHeld; 
    private int lifeInvest;
    private int lifePayout;

    public static Portfolio sellStock(String symbol, int numShares){
        return numShares;
    }
    
    public static int getCurrentValue(){
        return 1;
    }

    @Override
    public String toString()
    {
        //DO NOT EDIT THIS METHOD.
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%6s%25s%10s%15s%15s%n", 
            "Symbol", "Name", "Shares", "@Price", "Total"));
        sb.append("-----------------------------------------------------------------------\n");

        for(StockHolding s : stocks){
            sb.append(s.toString());
        }
        return sb.toString();
    }
}
