package haw.sorting;

import haw.datatypes.Node;
import haw.datatypes.NodeIndex;

import java.util.ArrayList;

public class SelectionSort extends AbstractSort {
    public SelectionSort(ArrayList<? extends Node> nodes) {
        super.start(nodes);
    }

    @Override
    protected ArrayList<NodeIndex> sortAlgorithm() {
        ArrayList<NodeIndex> nodes = super.getNodeIndices();
        int counter = 0;
        while (counter < nodes.size()) {
            int currentMin = counter;
            for (int i = counter; i < nodes.size(); i++) {
                if (nodes.get(currentMin).getKey() > nodes.get(i).getKey()) currentMin = i;
                super.addComparisons();
            }
            super.swapsNode(nodes, counter, currentMin);
            super.addSwaps();
            counter++;
        }
        System.out.printf("SS Comparisons= %d Swaps = %d \n", super.getComparisons(), super.getSwaps());
        return super.getNodeIndices();
    }
}
