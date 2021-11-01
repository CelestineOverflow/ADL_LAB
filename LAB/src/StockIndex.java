import haw.datatypes.NodeIndex;
import haw.datatypes.Stock;

import java.util.ArrayList;
import java.util.Random;

public class StockIndex {
    private Random rand;
    private ArrayList<Stock> stocks;
    public StockIndex(int numberOfStocks){
        rand = new Random();
        stocks = generateIndex(numberOfStocks);
    }
    public ArrayList<Stock> generateIndex(int numOfStocks){
        ArrayList<Stock> newIndex = new ArrayList<>();
        int characterCounter = 0;
        for (int i = 0; i < numOfStocks; i++){
            String name = generateName(characterCounter);
            double price = rand.nextDouble() * 100;
            double allTimeHigh = rand.nextDouble() * 100;
            int volume = rand.nextInt(100000);
            newIndex.add(new Stock(name, price, allTimeHigh, volume));
            characterCounter++;
        }
        return newIndex;
    }
    public String generateName(int counter){//not the most elegant way but it does the trick
        StringBuilder output = new StringBuilder();
        if(counter >= 18279){//26^3 + 26^2 + 26^1 + 26^0
            System.out.println("out of bounds!");
        }
        int characterCounter = counter;
        char firstChar = (char)(characterCounter%26 + 'A');
        characterCounter/=26;
        char secondChar = (char)(characterCounter%26 + 'A');
        characterCounter/=26;
        char thirdChar = (char)(characterCounter%26 + 'A');
        characterCounter/=26;
        char fourthChar = (char)(characterCounter%26 + 'A');
        output.append(fourthChar).append(thirdChar).append(secondChar).append(firstChar);
        return (output.toString());
    }
    public void printIndex(){
        System.out.printf("Name |  Price |  ATH  | Volume |\n");
        for (Stock stock : stocks){
            System.out.printf("%s  | $%5.2f | %5.2f | %6d |\n", stock.getName(), stock.getPrice(), stock.getAllTimeHigh(), stock.getVolume());
        }
    }
    public void swap(ArrayList<NodeIndex> nodeIndices){
        ArrayList<Stock> sortedStockIndex = new ArrayList<>();
        for (NodeIndex node : nodeIndices){
             sortedStockIndex.add(stocks.get(node.getIndex()));
        }
        stocks = sortedStockIndex;
    }

    public void sort() {
        //SelectionSort selectionSort = new SelectionSort(stocks);
        //swap(selectionSort.sortAlgorithm());
        QuickSort quickSort = new QuickSort(stocks);
        swap(quickSort.sortAlgorithm());
    }
}

