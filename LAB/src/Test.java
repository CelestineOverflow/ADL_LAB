import java.util.ArrayList;

public class Test {
    private StockIndex stockIndex;
    private static final int NUMBER_OF_STOCKS = 1000;
    private static final int REPETITIONS = 1000;
    private int ssComparisons, ssSwaps, qsComparisons, qsSwaps;
    public Test(){
        qsComparisons = 0;
        qsSwaps = 0;
        ssComparisons = 0;
        ssSwaps = 0;
        for (int i = 0; i < REPETITIONS; i++){
            System.out.print("RUN N= " +  i + " ");
            start();
        }
        qsComparisons/=REPETITIONS;
        qsSwaps/=REPETITIONS;
        ssComparisons/=REPETITIONS;
        ssSwaps/=REPETITIONS;
        System.out.printf("AVG ssComparisons = %d ssSwaps = %d qsComparisons = %d qsSwaps = %d\n", ssComparisons, ssSwaps, qsComparisons, qsSwaps);
    }
    public void start(){
        stockIndex = new StockIndex(NUMBER_OF_STOCKS);
        //stockIndex.printIndex();
        stockIndex.sort();//Performs Selection Sort/QuickSort
        results(stockIndex.getResults());

    }
    public void results(ArrayList<Integer> results){
        if (results.size()!=4){
            System.out.printf("error in results\n");
        }
        ssComparisons+=results.get(0);
        ssSwaps+=results.get(1);
        qsComparisons+=results.get(2);
        qsSwaps+=results.get(3);
    }

    public static void main(String[] args) {
        Test  test = new Test();
    }
}
