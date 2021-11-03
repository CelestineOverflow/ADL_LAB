package haw.datatypes;

public class Stock implements Node {
    private final StockName stockName;
    private final int price;
    private final double allTimeHigh;
    private final int volume;

    public Stock(int id, int price, double allTimeHigh, int volume) {
        this.stockName = new StockName(id);
        this.price = price;
        this.allTimeHigh = allTimeHigh;
        this.volume = volume;
    }

    public static String stringPrice(int price) {
        return String.valueOf(((double) (price)) / 1000);
    }

    @Override
    public int getKey() {
        return price;
    }

    public String getName() {
        return stockName.getName();
    }

    public int getPrice() {
        return price;
    }

    public double getAllTimeHigh() {
        return allTimeHigh;
    }

    public int getVolume() {
        return volume;
    }
}
