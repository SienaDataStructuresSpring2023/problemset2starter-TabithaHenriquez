/**
 * Write a description of class Asset here.
 *
 * @author Tabitha Henriquez
 * @version Spring 2023
 */
public class StockHolding
{
    private String symbol;
    private String name;
    private int numShares;
    private int price;
    public StockHolding(String symbol, String name, int numShares, int price) {
        this.symbol = symbol;
        this.name = name;
        this.numShares = numShares;
        this.price = price;
    }
    public String getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
    public int getNumShares() {
        return numShares;
    }
    public int getPrice() {
        return price;
    }
    public static int buyShares(int numShares, int price) {
        
        return 1;
    }
    public static int sellShares(int numShares) {
       
        return 1;
    }
    @Override
    public String toString()
    {
        //DO NOT EDIT THIS METHOD.
        return String.format("%6s%25s%,10d  $%,12.2f  $%,12.2f%n", 
        symbol, name, numShares, price, numShares * price); 
    }
}
