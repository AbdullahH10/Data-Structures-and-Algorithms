package dev.abdullahhassan.dsa.algorithms.sort;

public class  QuickSort {
    public static void sort(int[] array){
        quickSort(array, 0, array.length-1);
    }


    private static void quickSort(int[] array, int left, int right){
        if(left<right){
            int partitionedPosition = partition(array, left, right);
            quickSort(array, left, partitionedPosition-1);
            quickSort(array, partitionedPosition+1, right);
        }
    }

    private static int partition(int[] array, int left, int right){
        int pivotIndex = left+(right-left)/2; //Assuming pivot is mid. Could also be random.
        //int pivotIndex = left; //Assuming pivot is left.
        int pivot = array[pivotIndex]; //Saving pivot.
        swap(array,pivotIndex,right); //Swaping pivot to the righmost position.

        int i=left;
        int j=left;
        while(i<right){
            if(array[i]<pivot){
                swap(array,i,j);
                ++j;
            }
            ++i;
        }
        /*
        Swaping pivot again with the j position.
        All values left to j is less than pivot.
        All values right to j is greater than pivot.
        Pivot is in sorted position which is called partitioning.
        */
        swap(array,++j,right);
        return j;
    }

    private static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i]= array[j];
        array[j]= temp;
    }

    public static void sort(char[] array){
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(char[] array, int left, int right){
        if(left<right){
            int partitionedPosition = partition(array, left, right);
            quickSort(array, left, partitionedPosition-1);
            quickSort(array, partitionedPosition+1, right);
        }
    }

    private static int partition(char[] array, int left, int right){
        int pivotIndex = left+(right-left)/2; //Assuming pivot is mid. Could also be random.
        int pivot = array[pivotIndex]; //Saving pivot.
        swap(array,pivotIndex,right); //Swaping pivot to the righmost position.

        int i=left;
        int j=left;
        while(i<right){
            if(array[i]<pivot){
                swap(array,i,j);
                ++j;
            }
            ++i;
        }
        /*
        Swaping pivot again with the j position.
        All values left to j is less than pivot.
        All values right to j is greater than pivot.
        Pivot is in sorted position which is called partitioning.
        */
        swap(array,++j,right);
        return j;
    }

    private static void swap(char[] array,int i,int j){
        char temp = array[i];
        array[i]= array[j];
        array[j]= temp;
    }
}