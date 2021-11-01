import haw.datatypes.Node;
import haw.datatypes.NodeIndex;
import haw.datatypes.Stock;

import java.util.ArrayList;

public class SelectionSort extends AbstractSort {
    public SelectionSort(ArrayList<? extends Node> nodes){
        super.start(nodes);
    }

    @Override
    public ArrayList<NodeIndex> sortAlgorithm() {
        ArrayList<NodeIndex> nodes = super.getNodeIndices();
        int counter = 0;
        while(counter < nodes.size()){
            int currentMin = counter;
            for (int i = counter; i < nodes.size(); i++){
                if (nodes.get(currentMin).getKey() > nodes.get(i).getKey()) currentMin = i;
                super.addComparisons();
            }
            super.swaps(nodes, counter, currentMin);
            counter++;
        }
        return super.getNodeIndices();
    }
}
