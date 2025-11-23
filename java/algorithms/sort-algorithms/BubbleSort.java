import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    private static void swap(int[] array, int pos1, int pos2){
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    private static void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sizeOfInputArray = scanner.nextInt();
        int[] inputArray = new int[sizeOfInputArray];

        for(int i=0;i<sizeOfInputArray;i++){
            inputArray[i] = scanner.nextInt();
        }
        scanner.close();

        bubbleSort(inputArray);

        System.out.print("Sorted: ");
        for(int i=0;i<sizeOfInputArray;i++){
            System.out.print(inputArray[i]+" ");
        }
    }
}
