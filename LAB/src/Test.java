
public class Test {
    private StockIndex stockIndex;
    private static int NUMBER_OF_STOCKS = 10;
    public Test(){
        stockIndex = new StockIndex(NUMBER_OF_STOCKS);
        stockIndex.printIndex();
        stockIndex.sort();//Performs Selection Sort
        stockIndex.printIndex();
    }

    public static void main(String[] args) {
        Test  test = new Test();
    }
}
