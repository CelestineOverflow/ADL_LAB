package haw.datatypes;

public class Stock implements Node{
    private String name;
    private double price;
    private double allTimeHigh;
    private int volume;
    public Stock(String name, double price, double allTimeHigh, int volume){
        this.name = name;
        this.price = price;
        this.allTimeHigh = allTimeHigh;
        this.volume = volume;
    }
    @Override
    public int getKey() {
        return (int) price * 10;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAllTimeHigh() {
        return allTimeHigh;
    }

    public int getVolume() {
        return volume;
    }
}
