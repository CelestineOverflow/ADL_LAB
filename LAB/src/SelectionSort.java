import haw.datatypes.Stock;

import java.util.ArrayList;

public class SelectionSort extends Sort {
    public SelectionSort(){
        super();
    }
    public ArrayList<Stock> sort(ArrayList<Stock> index) {
        ArrayList<Stock> SortedIndex = new ArrayList<>();
        while (!index.isEmpty()) {
            int currentStockIndex = 0;
            for (int i = 0; i < index.size(); i++) {
                if (index.get(currentStockIndex).getKey() >= index.get(i).getKey()) currentStockIndex = i;
                super.addComparisons();
            }
            SortedIndex.add(index.get(currentStockIndex));
            index.remove(currentStockIndex);
            super.addSwaps();
        }
        System.out.println("Selection Sort Comparisons = " + super.getComparisons() + " Swaps = " + super.getSwaps());
        return SortedIndex;
    }
}
