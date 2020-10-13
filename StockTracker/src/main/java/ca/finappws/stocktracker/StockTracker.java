package ca.finappws.stocktracker;

import ca.finappws.stocktracker.readers.ReadCSV;
import ca.finappws.stocktracker.model.Stock;
import ca.finappws.stocktracker.model.Portfolio;
import java.io.IOException;
import java.io.FileNotFoundException;
// import java.io.FileReader;
// import com.opencsv.CSVWriter;
// import java.io.BufferedReader;

//
public class StockTracker {

    public static void main(String[] args) throws IOException {
        System.out.println("ABC");

        String path = "/Users/jin/Work/FinAppWS/stocks.csv";

        Portfolio portfolio = ReadCSV.CSV_Reader(path);
        double totalValue = 0;
        for(Stock stock : portfolio.getStocks()) {
            double stockTotalValue = stock.getTotalVal();
            totalValue = stockTotalValue + totalValue;
        }

        System.out.println("Total value of portfolio: "+ totalValue);
    }

}
