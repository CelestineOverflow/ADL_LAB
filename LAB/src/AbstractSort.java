import haw.datatypes.Node;
import haw.datatypes.NodeIndex;

import java.util.ArrayList;

public abstract class AbstractSort {
    private int swaps;
    private int comparisons;
    private ArrayList<NodeIndex> nodeIndices;
    public void start(ArrayList<? extends Node> nodes){
        swaps = 0;
        comparisons = 0;
        nodeIndices = initNodeIndices(nodes);
    }
    abstract public ArrayList<NodeIndex> sortAlgorithm();

    public ArrayList<NodeIndex> getNodeIndices() {
        return nodeIndices;
    }
    public void addComparisons(){
        comparisons++;
    }
    public ArrayList<NodeIndex> initNodeIndices(ArrayList<? extends Node> nodes){
        int counter = 0;
        ArrayList<NodeIndex> newNodeIndex = new ArrayList<>();
        for (Node node : nodes){
            newNodeIndex.add(new NodeIndex(counter, node.getKey()));
            counter++;
        }
        return newNodeIndex;
    }
    public void swaps(ArrayList<NodeIndex> nodeIndices, int first, int second){
        NodeIndex firstNode = new NodeIndex(nodeIndices.get(first).getIndex(), nodeIndices.get(first).getKey());
        NodeIndex secondNode = new NodeIndex(nodeIndices.get(second).getIndex(), nodeIndices.get(second).getKey());
        nodeIndices.set(first, secondNode);
        nodeIndices.set(second, firstNode);
    }
}
