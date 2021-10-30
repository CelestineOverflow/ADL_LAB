package haw.datatypes;

public class Stock implements Node{
    private String name;
    private double price;
    public Stock(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public int getKey() {
        return (int) price * 100;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
