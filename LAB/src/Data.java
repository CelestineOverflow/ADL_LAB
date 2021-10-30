import haw.datatypes.Node;
import haw.datatypes.Stock;

import java.util.ArrayList;
import java.util.Random;

public class Data{
    private ArrayList<Stock> stockIndex;
    private Random rand;
    public Data(int numOfStocks){
        rand = new Random();
        stockIndex = generateIndex(numOfStocks);
        printIndex(stockIndex);
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
            newIndex.add(new Stock(name, price));
        }
        return newIndex;
    }
    public static void printIndex(ArrayList<Stock> index){
        for (Stock stock : index){
            System.out.printf("Name = %s Price = $%.2f\n", stock.getName(), stock.getPrice());
        }
    }
}
