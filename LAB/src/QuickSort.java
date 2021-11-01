import haw.datatypes.Node;
import haw.datatypes.NodeIndex;
import haw.datatypes.Stock;

import java.util.ArrayList;

public class QuickSort extends AbstractSort {
    public QuickSort(ArrayList<? extends Node> nodes){
        super.start(nodes);
    }

    @Override
    public ArrayList<NodeIndex> sortAlgorithm() {
        int start = 0;
        int end = getNodeIndices().size() - 1;
        sort(super.getNodeIndices(), start, end);
        return super.getNodeIndices();
    }
    private void sort(ArrayList<NodeIndex> nodes, int start, int end){
        if (start<end){
            int pivot = partition(nodes, start, end);
            sort(nodes, start, pivot-1);
            sort(nodes, pivot+1, end);
        }
    }
    private int partition(ArrayList<NodeIndex> nodes, int start, int end){
        int pivot = nodes.get(end).getKey();
        int i = start-1;
        for (int j = start; j<=end; j++){
            if (nodes.get(j).getKey()<pivot){
                i++;
                NodeIndex t = nodes.get(i);
                nodes.set(i, nodes.get(j));
                nodes.set(j, t);
            }
        }
        NodeIndex t = nodes.get(i+1);
        nodes.set(i+1, nodes.get(end));
        nodes.set(end, t);
        return i + 1;
    }
}
