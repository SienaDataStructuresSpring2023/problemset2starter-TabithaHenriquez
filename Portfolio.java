import java.util.ArrayList;

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

    public Portfolio(){
        this.stocksHeld = 0;
        this.lifeInvest = 0;
        this.lifePayout = 0;
        ArrayList<String> StocksHolding = new ArrayList<String>(); 
    }
    
    public int getLifeInvest(){
        return lifeInvest;
    }

    public int getLifePayout(){
        return lifePayout;
    }

    //Returns the index of the stock in ArrayList if it exists.
    private static String getIndex(String symbol) {
        //Indexing through the StocksHolding ArrayList.
        for (i=0; i < StocksHolding.size; i++){
            //If the symbol is found in the ArrayList, return the index.
            if(symbol == StocksHolding.get(i)){
                return i;
            }
            //If no such stock can be found, return -1.
            else{
                return -1;
            }
        }
    }
 
    public int buyStock(String symbol, String name, int numShares, int price ){
        //If symbol is in the ArrayList, buy at input price.
        for (i=0;i<StocksHolding.size;i++){
            if (symbol == StocksHolding.get(i)){
                //Purchase the amount of stock for the input amount purchased.
                j = 0;
                while (j <= numShares){
                    StocksHolding.add(symbol);
                    lifeInvest = lifeInvest + price;
                    stocksHeld++;
                }
                return price*numShares; 
            }
            //Otherwise, stock should be added to ArrayList and updated stocks held by portfolio.
            else{
                //Add stock to ArrayList for the amount purchsed.
                j = 0;
                while (j <= numShares){
                    StocksHolding.add(symbol);
                    lifeInvest = lifeInvest + price;
                    stocksHeld++;
                }
                //Return purchase cost.
                return price*numShares;
            } 
        }
    }

    public Portfolio sellStock(String symbol, int numShares){
        int sharesInPortfolio = 0;
        
        //Searching through ArrayList for input stock.
        for (i=0;i<StocksHolding.size;i++){ 
            //Determine the amount of shares in the portfolio.
            if (symbol == StocksHolding.get(i)){
                sharesInPortfolio++;
            }
        }
        
        //Removes all shares of the input stock if zero shares are held.
        if (sharesInPortfolio <= numShares){
            StocksHolding.removeAll(symbol);
            stocksHeld = stocksHeld - numShares;
        }

        //Returns payout of selling shares.
        int payout = sellShares(numShares).StockHolding;
        lifePayout = lifePayout - payout;

        return payout;
    }

    public int getCurrentValue(){
        //Sums the number of shares times the price per share
        int currentValue = numShares * price;
        //Returns the current value of the portfolio
        return currentValue;
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
