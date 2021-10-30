package haw.datatypes;

import java.util.ArrayList;

public class QuickSort {
    public static ArrayList<Stock> sort(ArrayList<Stock> index, int partitionIndex){
        ArrayList<Stock> sortedList = new ArrayList<>();
        int LastElementIndex = index.size()-1;

        return sortedList;
    }
    public static ArrayList<Stock> addFromTo(ArrayList<Stock> from, ArrayList<Stock> to){
        for (Stock stock : from){
            to.add(new Stock(stock.getName(), stock.getPrice()));
        }
        return to;
    }
    public static void printIndex(ArrayList<Stock> index){
        for (Stock stock : index){
            System.out.printf("Name = %s Price = $%.2f\n", stock.getName(), stock.getPrice());
        }
    }
}
