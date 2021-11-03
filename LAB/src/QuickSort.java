import haw.datatypes.Node;
import haw.datatypes.NodeIndex;

import java.util.ArrayList;

public class QuickSort extends AbstractSort {
    public QuickSort(ArrayList<? extends Node> nodes) {
        super.start(nodes);
    }

    @Override
    protected ArrayList<NodeIndex> sortAlgorithm() {
        int start = 0;
        int end = getNodeIndices().size() - 1;
        sort(super.getNodeIndices(), start, end);
        System.out.printf("QS Comparisons= %d Swaps = %d\n", super.getComparisons(), super.getSwaps());
        return super.getNodeIndices();
    }

    private void sort(ArrayList<NodeIndex> nodes, int start, int end) {
        if (start < end) {
            int pivot = partitionSwap(nodes, start, end);
            sort(nodes, start, pivot - 1);
            sort(nodes, pivot + 1, end);
        }
    }

    private int middle(ArrayList<NodeIndex> nodes, int start, int end) {
        return start + end / 2;
    }

    private int partition(ArrayList<NodeIndex> nodes, int start, int end) {
        int pivotIndex = start;
        int pivot = nodes.get(pivotIndex).getKey();
        int i = start;
        for (int j = start; j <= end; j++) {
            if (nodes.get(j).getKey() < pivot) {
                super.addComparisons();
                i++;
                super.swapsNode(nodes, i, j);
                super.addSwaps();
            }
        }
        super.swapsNode(nodes, i, start);//
        super.addSwaps();
        System.out.printf("I = %d\n", pivotIndex);
        return i;
    }
    private int partitionSwap(ArrayList<NodeIndex> nodes, int start, int end){//partition can be change by swapping the pivot point
        int pivotIndex =  middle(nodes, start, end); //chooses middle point
        super.swapsNode(nodes, pivotIndex, start);
        return partition(nodes, start, end);
    }
}
