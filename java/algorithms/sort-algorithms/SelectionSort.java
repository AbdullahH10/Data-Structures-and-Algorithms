/*
The idea of selection sort is to select the lower bound element l and then find the minimum from rest of
(n-l) elements in the array. If element at index l is greater than the found minmum then we swap.
Algorithm:
    1. l=0 to l=n-2
    2. Find minimum element from (n-l) elements and store value in  cur_min
    3. If nums[l] is greater than cur_min swap
*/
import java.util.*;

public class SelectionSort {
    private static void swap(int[] array, int pos1, int pos2){
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public static void selectionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int selectedValueFromTheArray = array[i];
            int indexOfSelectedValueFromTheArray = i;
            int minimumValueFromRestOfTheArray = Integer.MAX_VALUE;
            int indexOfMinimumValueFromRestOfTheArray = -1;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < minimumValueFromRestOfTheArray) {
                    minimumValueFromRestOfTheArray = array[j];
                    indexOfMinimumValueFromRestOfTheArray = j;
                }
            }
            if(minimumValueFromRestOfTheArray<selectedValueFromTheArray){
                swap(array,indexOfSelectedValueFromTheArray,indexOfMinimumValueFromRestOfTheArray);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfInputArray = scanner.nextInt();
        int[] inputArray = new int[sizeOfInputArray];

        for(int i=0;i<sizeOfInputArray;i++){
            inputArray[i] = scanner.nextInt();
        }
        scanner.close();

        selectionSort(inputArray);

        System.out.print("Sorted: ");
        for(int i=0;i<sizeOfInputArray;i++){
            System.out.print(inputArray[i]+" ");
        }
    }
}
