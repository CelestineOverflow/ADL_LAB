import haw.datatypes.StockIndex;

import java.util.ArrayList;

public class Test {
    private static final int NUMBER_OF_STOCKS = 1000;
    private static final int REPETITIONS = 1000;
    private StockIndex stockIndex;
    private int ssComparisons, ssSwaps, qsComparisons, qsSwaps;

    public Test() {
        qsComparisons = 0;
        qsSwaps = 0;
        ssComparisons = 0;
        ssSwaps = 0;
        for (int i = 0; i < REPETITIONS; i++) {
            System.out.print("RUN N = " + i + "\n");
            start();
        }
        qsComparisons /= REPETITIONS;
        qsSwaps /= REPETITIONS;
        ssComparisons /= REPETITIONS;
        ssSwaps /= REPETITIONS;
        System.out.printf("AVERAGE RESULTS SELECTION SORT\n");
        System.out.printf("Comparisons = %d Swaps = %d \n", ssComparisons, ssSwaps);
        System.out.printf("AVERAGE RESULTS QUICK SORT\n");
        System.out.printf("Comparisons = %d Swaps = %d \n", qsComparisons, qsSwaps);
    }

    public static void main(String[] args) {
        Test test = new Test();
    }

    public void start() {
        stockIndex = new StockIndex(NUMBER_OF_STOCKS);
        stockIndex.printIndex();
        stockIndex.sort();//Performs Selection Sort/haw.sorting.QuickSort
        results(stockIndex.getResults());

    }

    public void results(ArrayList<Integer> results) {
        if (results.size() != 4) {
            System.out.printf("error in results\n");
        }
        ssComparisons += results.get(0);
        ssSwaps += results.get(1);
        qsComparisons += results.get(2);
        qsSwaps += results.get(3);
    }
}
