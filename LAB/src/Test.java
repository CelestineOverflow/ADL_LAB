
public class Test {
    private StockIndex stockIndex;
    private static final int NUMBER_OF_STOCKS = 10;
    private static final int REPETITIONS = 1;
    public Test(){
        for (int i = 0; i < REPETITIONS; i++){
            stockIndex = new StockIndex(NUMBER_OF_STOCKS);
            stockIndex.printIndex();
            stockIndex.sort();//Performs Selection Sort/QuickSort
        }
    }

    public static void main(String[] args) {
        Test  test = new Test();
    }
}
