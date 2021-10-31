import haw.datatypes.Stock;

import java.util.ArrayList;
import java.util.Random;

public class StockIndex {
    Random rand;
    ArrayList<Stock> stocks;
    public StockIndex(int numberOfStocks){
        rand = new Random();
        stocks = generateIndex(numberOfStocks);
    }
    public ArrayList<Stock> generateIndex(int numOfStocks){
        ArrayList<Stock> newIndex = new ArrayList<>();
        for (int i = 0; i < numOfStocks; i++){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((char)(rand.nextInt(26) + 'A'));
            stringBuilder.append((char)(rand.nextInt(26) + 'A'));
            stringBuilder.append((char)(rand.nextInt(26) + 'A'));
            String name = stringBuilder.toString();
            double price = rand.nextDouble() * 100;
            double allTimeHigh = rand.nextDouble() * 100;
            int volume = rand.nextInt(100000);
            newIndex.add(new Stock(name, price, allTimeHigh, volume));
        }
        return newIndex;
    }
    public void printIndex(){
        System.out.printf("Name |  Price |  ATH  | Volume |\n");
        for (Stock stock : stocks){
            System.out.printf("%s  | $%5.2f | %5.2f | %6d |\n", stock.getName(), stock.getPrice(), stock.getAllTimeHigh(), stock.getVolume());
        }
    }

    public void sort() {
        SelectionSort selectionSort = new SelectionSort();
        stocks = selectionSort.sort(stocks);
    }
}

