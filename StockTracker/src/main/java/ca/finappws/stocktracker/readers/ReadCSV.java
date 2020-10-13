package ca.finappws.stocktracker.readers;

import ca.finappws.stocktracker.model.Stock;
import ca.finappws.stocktracker.model.Portfolio;
// import ca.fantasybasketball.teamweeklystats.model.Roster;
// import ca.fantasybasketball.teamweeklystats.model.Stats;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.File;
import java.io.FileNotFoundException;

// Read the CSV File and enter the lines into
// a roster
public class ReadCSV {

    private ReadCSV() {
    }

    public static Portfolio CSV_Reader(String filename) throws IOException {

        String[] line;
        Double d = 1.4;
        Portfolio portfolio = new Portfolio();

        String word = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            // Skip first line
            br.readLine();
            while((word = br.readLine()) != null) {
                String[] values = word.split(",");
                System.out.println("Stock Name:" + values[0]);
                Stock stock = new Stock();
                stock.setStockName(values[0]);
                stock.setSymbol(values[1]);
                stock.setNumOfShares(Integer.parseInt(values[2]));
                stock.setAvgPrice(d.parseDouble(values[3]));
                stock.setCurrentPrice(d.parseDouble(values[4]));
                stock.setTotalVal(d.parseDouble(values[5]));
                portfolio.getStocks().add(stock);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return portfolio;
    }

}
