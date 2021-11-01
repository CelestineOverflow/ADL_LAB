package haw.datatypes;

public class NodeIndex implements Node{
    private int key;
    private int index;
    public NodeIndex(int index, int key){
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
