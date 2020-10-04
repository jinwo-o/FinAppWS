package ca.finappws.stocktracker.readers;

import ca.finappws.stocktracker.model.Stock;
// import ca.fantasybasketball.teamweeklystats.model.Roster;
// import ca.fantasybasketball.teamweeklystats.model.Stats;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.File;

// Read the CSV File and enter the lines into
// a roster
public class ReadCSV {

    private ReadCSV() {
    }

    public static Portfolio CSV_Reader(String filename) throws IOException {

        String[] line;
        Double d = 1.4;
        Portfolio portfolio = new Portfolio();

        final CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        final CSVReader reader = new CSVReaderBuilder(new FileReader(filename)).withSkipLines(1).withCSVParser(parser).build();
        while ((line = reader.readNext()) != null) {
            Stock stock = new Stock();
            stock.setStockName(line[0]);
            stock.setSymbol(line[1]);
            stock.setNumOfShares(Integer.parseInt(line[2]));
            stock.setAvgPrice(d.parseDouble(line[3]));
            stock.setCurrentPrice(d.parseDouble(line[4]));
            stock.setTotalVal(d.parseDouble(line[5]));
            portfolio.getStocks().add(stock);
        }
        return portfolio;
    }

}