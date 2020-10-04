package ca.finappws.stocktracker;

import ca.finappws.stocktracker.readers.ReadCSV;
import ca.finappws.stocktracker.model.Stock;
import ca.finappws.stocktracker.model.Portfolio;
import java.io.IOException;


//
public class StockTracker {

    public static void main(String[] args) throws IOException {
        Portfolio portfolio = ReadCSV.CSV_Reader("/users/jin/work/FinAppWS/stocks.csv");
        double totalValue = 0;
        for(Stock stock : portfolio.getStocks()) {
            double stockTotalValue = stock.getTotalVal();
            totalValue = stockTotalValue + totalValue;
        }

        System.out.println("Total value of portfolio: "+ totalValue);
    }

}