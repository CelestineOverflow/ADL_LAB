package haw.datatypes;

public class NodeIndex implements Node {
    private final int key;
    private final int index;

    public NodeIndex(int index, int key) {
        this.key = key;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int getKey() {
        return key;
    }
}
