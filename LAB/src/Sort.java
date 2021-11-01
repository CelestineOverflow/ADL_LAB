import haw.datatypes.Node;
import haw.datatypes.NodeIndex;
import haw.datatypes.Stock;

import java.util.ArrayList;

public class Sort {
    private int comparisons;
    private int swaps;

    public ArrayList<NodeIndex> getSortedIndex() {
        return sortedIndex;
    }

    private ArrayList<NodeIndex> sortedIndex;
    private int sizeOfList;
    public Sort(ArrayList<Stock> nodes){
        comparisons = 0;
        swaps = 0;
        sizeOfList = nodes.size();
        sortedIndex = initIndex(nodes);
    }
    public ArrayList<NodeIndex> initIndex(ArrayList<Stock> nodes){
        ArrayList<NodeIndex> newNodeIndex = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++){
            newNodeIndex.add(new NodeIndex(i, nodes.get(i).getKey()));
        }
        return newNodeIndex;
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


