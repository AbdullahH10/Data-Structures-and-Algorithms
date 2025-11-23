import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int toBeSorted = array[i];
            int j=i-1;
            while(j>=0 && array[j]>toBeSorted){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=toBeSorted;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfInputArray = scanner.nextInt();
        int[] input = new int[sizeOfInputArray];

        for(int i=0;i<sizeOfInputArray;i++){
            input[i] = scanner.nextInt();
        }
        scanner.close();

        insertionSort(input);

        System.out.print("Sorted: ");
        for(int i=0;i<sizeOfInputArray;i++){
            System.out.print(input[i]+" ");
        }
    }
}
