package ca.finappws.stocktracker;

// import ca.finappws.stocktracker.readers.ReadCSV;
// import ca.finappws.stocktracker.model.Stock;
// import ca.finappws.stocktracker.model.Portfolio;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
// import com.opencsv.CSVWriter;
import java.io.BufferedReader;

//
public class StockTracker {

    public static void main(String[] args) throws IOException {
        System.out.println("ABC");

        String path = "/Users/jin/Work/FinAppWS/stocks.csv";
        String line = "";

        try {
            System.out.println("We here");
            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println("Stock Name:" + values[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // CSVWriter writer = new CSVWriter(new FileWriter("stocks.csv"));

        // Portfolio portfolio = ReadCSV.CSV_Reader("/users/jin/work/FinAppWS/stocks.csv");
        // double totalValue = 0;
        // for(Stock stock : portfolio.getStocks()) {
        //     double stockTotalValue = stock.getTotalVal();
        //     totalValue = stockTotalValue + totalValue;
        // }

        // System.out.println("Total value of portfolio: "+ totalValue);
    }

}