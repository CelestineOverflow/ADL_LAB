import haw.datatypes.Node;

import java.util.ArrayList;

public class Sort {
    private int comparisons;
    private int swaps;
    public Sort(){
        comparisons = 0;
        swaps = 0;
    }
    public int getComparisons() {
        return comparisons;
    }

    public void addComparisons() {
        this.comparisons++;
    }

    public int getSwaps() {
        return swaps;
    }

    public void addSwaps() {
        this.swaps++;
    }
}


