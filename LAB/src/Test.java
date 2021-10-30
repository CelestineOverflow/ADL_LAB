
public class Test {
    private StockIndex stockIndex;
    private static int NUMBER_OF_STOCKS = 100;
    public Test(){
        stockIndex = new StockIndex(NUMBER_OF_STOCKS);
        //stockIndex.printIndex();
        stockIndex.sort();
        stockIndex.printIndex(stockIndex.stocks);
    }

    public static void main(String[] args) {
        Test  test = new Test();
    }
}
