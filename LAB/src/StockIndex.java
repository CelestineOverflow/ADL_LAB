import haw.datatypes.NodeIndex;
import haw.datatypes.Stock;

import java.util.ArrayList;
import java.util.Random;

public class StockIndex {
    private final Random rand;
    private ArrayList<Stock> stocks;
    private final ArrayList<Integer> results;

    public StockIndex(int numberOfStocks) {
        rand = new Random();
        stocks = generateIndex(numberOfStocks);
        results = new ArrayList<>();
    }

    public ArrayList<Stock> generateIndex(int numOfStocks) {
        ArrayList<Stock> newIndex = new ArrayList<>();
        int idCounter = 0;
        for (int i = 0; i < numOfStocks; i++) {
            int price = rand.nextInt(100000);
            double allTimeHigh = rand.nextDouble() * 100;
            int volume = rand.nextInt(100000);
            newIndex.add(new Stock(idCounter, price, allTimeHigh, volume));
            idCounter++;
        }
        return newIndex;
    }

    public void printIndex() {
        System.out.printf("Name  |  Price  |  ATH  | Volume |\n");
        for (Stock stock : stocks) {
            System.out.printf("%s  | $%-6s | %5.2f | %6d |\n", stock.getName(), Stock.stringPrice(stock.getPrice()), stock.getAllTimeHigh(), stock.getVolume());
        }
    }

    public void printSorted(ArrayList<NodeIndex> nodeIndices) {
        System.out.printf("Name  |  Price  |  ATH  | Volume |\n");
        for (NodeIndex nodeIndex : nodeIndices) {
            Stock stock = stocks.get(nodeIndex.getIndex());
            System.out.printf("%s  | $%-6s | %5.2f | %6d |\n", stock.getName(), Stock.stringPrice(stock.getPrice()), stock.getAllTimeHigh(), stock.getVolume());
        }
    }

    public void swap(ArrayList<NodeIndex> nodeIndices) {
        ArrayList<Stock> sortedStockIndex = new ArrayList<>();
        for (NodeIndex node : nodeIndices) {
            sortedStockIndex.add(stocks.get(node.getIndex()));
        }
        stocks = sortedStockIndex;
    }

    public void sort() {
        SelectionSort selectionSort = new SelectionSort(stocks);
        printSorted(selectionSort.getNodeIndices());
        results.add(selectionSort.getComparisons());
        results.add(selectionSort.getSwaps());
        QuickSort quickSort = new QuickSort(stocks);
        printSorted(quickSort.getNodeIndices());
        results.add(quickSort.getComparisons());
        results.add(quickSort.getSwaps());
    }

    public ArrayList<Integer> getResults() {
        return results;
    }

}

