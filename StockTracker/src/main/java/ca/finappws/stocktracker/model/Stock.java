package ca.finappws.stocktracker.model;

public class Stock {
    public String stockName;
    public String symbol;   
    public int numOfShares;
    public double avgPrice;
    public double currentPrice;
    // public double yearlyHigh;
    public double totalVal;
    // public double ifYearlyHighTotal;


    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public int getNumOfShares() {
        return numOfShares;
    }
    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }
    public double getAvgPrice() {
        return avgPrice;
    }
    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }
    public double getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getTotalVal() {
        return totalVal;
    }
    public void setTotalVal(double totalVal) {
        this.totalVal = totalVal;
    }
    
}
