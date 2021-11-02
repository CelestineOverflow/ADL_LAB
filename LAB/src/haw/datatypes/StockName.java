package haw.datatypes;

public class StockName implements Node{
    private String name;
    private int id;
    public StockName(int id){
        this.id = id;
        this.name = generateName(id);
    }
    public String generateName(int counter){//not the most elegant way but it does the trick
        StringBuilder output = new StringBuilder();
        if(counter >= 18279){//26^3 + 26^2 + 26^1 + 26^0
            System.out.println("out of bounds!");
        }
        int characterCounter = counter;
        char firstChar = (char)(characterCounter%26 + 'A');
        characterCounter/=26;
        char secondChar = (char)(characterCounter%26 + 'A');
        characterCounter/=26;
        char thirdChar = (char)(characterCounter%26 + 'A');
        characterCounter/=26;
        char fourthChar = (char)(characterCounter%26 + 'A');
        output.append(fourthChar).append(thirdChar).append(secondChar).append(firstChar);
        return (output.toString());
    }
    @Override
    public int getKey() {
        return id;
    }
    public String getName() {
        return name;
    }
}
