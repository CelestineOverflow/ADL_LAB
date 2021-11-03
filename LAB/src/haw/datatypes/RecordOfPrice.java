package haw.datatypes;

import java.time.LocalDate;

public class RecordOfPrice implements Node {
    private int price;
    private final LocalDate localDate;

    public RecordOfPrice(int Price, LocalDate localDate) {
        this.price = price;
        this.localDate = localDate;
    }

    public static String stringPrice(int price) {
        return String.valueOf(((double) (price)) / 1000);
    }

    @Override
    public int getKey() {
        return price;
    }
}
