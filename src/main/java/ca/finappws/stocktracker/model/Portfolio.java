package ca.finappws.stocktracker.model;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    public String firstName;
    public String lastName;
    public List<Stock> stocks = new ArrayList<Stock>();

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
    
    // public double getTotalVal2(){
    //     Stock stock = new Stock();
    //     List<Stock> stocks = new ArrayList<Stock>();
    //     int totalVal = stock.getTotalVal;
    //     for(int i=1; i<=2; i++) {
    //         System.out.println("Enter Player Name");
    //         Stock stock = new Stock();
    //         stock.setTotal(totalVal);
    //         player.setStats(stats.readStats());
    //         roster.add(player);
    //         System.out.println("Players Added: " + i);
    //     }
    //     return totalVal;
    // }
}