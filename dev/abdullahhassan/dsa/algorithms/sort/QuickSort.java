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
        int pivotIndex = pickRandom(left, right); //Picking a random pivot between [left,right]
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
        swap(array,j,right);
        return j;
    }

    private static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i]= array[j];
        array[j]= temp;
    }

    //Picks a random integer between min and max inclusive.
    private static int pickRandom(int min,int max){
        int range = max-min+1;
        int random = (int)(Math.random()*range); //Math.random() returns double between 0.0 and 1.0
        return min+random; //offset by min to make it [min,max]
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
        swap(array,j,right);
        return j;
    }

    private static void swap(char[] array,int i,int j){
        char temp = array[i];
        array[i]= array[j];
        array[j]= temp;
    }
}