public class Sorteado {
    private int Array[]= new int[]{3, 7, 8, 5, 2, 1, 9, 5, 4};
    public Sorteado(){
    }
    public void sort(int[] array, int start, int end){
        if (start<end){
            int pivot = partition(Array, start, end);
            sort(Array, start, pivot-1);
            sort(Array, pivot+1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;
        for (int j = start; j<=end; j++){
            if (array[j]<pivot){
                i++;
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        int t = array[i+1];
        array[i+1] = array[end];
        array[end] = t;
        return (i + 1);
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.println("i= " + i + " n = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Sorteado sorteado = new Sorteado();
        Sorteado.printArray(sorteado.Array);
        System.out.println("Sorting");
        sorteado.sort(sorteado.Array, 0, sorteado.Array.length-1);
        Sorteado.printArray(sorteado.Array);
    }
}
