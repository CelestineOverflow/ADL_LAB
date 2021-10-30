package haw.datatypes;

import java.util.ArrayList;

public class SelectionSort {
    public static ArrayList<Stock> sort(ArrayList<Stock> index) {
        int comparisons = 0;
        int swaps = 0;
        ArrayList<Stock> SortedIndex = new ArrayList<>();
        while(!index.isEmpty()){
            int currentStockIndex = 0;
            for (int i = 0; i < index.size(); i++){
                if (index.get(currentStockIndex).getKey() > index.get(i).getKey()) currentStockIndex = i;
                comparisons++;
            }
            SortedIndex.add(index.get(currentStockIndex));
            index.remove(currentStockIndex);
            swaps++;
        }
        System.out.println("Selection Sort Comparisons = " + comparisons + " Swaps = " + swaps);
        return SortedIndex;
    }
}
