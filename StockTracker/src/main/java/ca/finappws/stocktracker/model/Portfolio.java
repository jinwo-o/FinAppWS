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
    
}
