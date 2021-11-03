import haw.datatypes.Node;
import haw.datatypes.NodeIndex;

import java.util.ArrayList;

public abstract class AbstractSort {
    private int comparisons;
    private int swaps;
    private ArrayList<NodeIndex> nodeIndices;

    public void start(ArrayList<? extends Node> nodes) {
        comparisons = 0;
        swaps = 0;
        nodeIndices = initNodeIndices(nodes);
        sortAlgorithm();
    }

    protected abstract ArrayList<NodeIndex> sortAlgorithm();

    protected ArrayList<NodeIndex> getNodeIndices() {
        return nodeIndices;
    }

    protected void addComparisons() {
        comparisons++;
    }

    protected void addSwaps() {
        swaps++;
    }

    public int getSwaps() {
        return swaps;
    }

    protected ArrayList<NodeIndex> initNodeIndices(ArrayList<? extends Node> nodes) {
        int counter = 0;
        ArrayList<NodeIndex> newNodeIndex = new ArrayList<>();
        for (Node node : nodes) {
            newNodeIndex.add(new NodeIndex(counter, node.getKey()));
            counter++;
        }
        return newNodeIndex;
    }

    protected void swapsNode(ArrayList<NodeIndex> nodeIndices, int first, int second) {
        NodeIndex firstNode = new NodeIndex(nodeIndices.get(first).getIndex(), nodeIndices.get(first).getKey());
        NodeIndex secondNode = new NodeIndex(nodeIndices.get(second).getIndex(), nodeIndices.get(second).getKey());
        nodeIndices.set(first, secondNode);
        nodeIndices.set(second, firstNode);
    }

    public int getComparisons() {
        return comparisons;
    }
}
