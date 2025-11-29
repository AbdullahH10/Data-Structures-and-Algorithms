package dev.abdullahhassan.dsa.algorithms.sort;

public class MergeSort {
    public static void sort(int[] array){
        mergeSort(array, 0, array.length-1);
    }

    private static void mergeSort(int[] array, int left, int right){
        int mid = left + ((right-left)/2);

        if(left<right){
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array,left,mid,right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right){
        int curLength = (right-left)+1; //current length of array we are working on
        int[] mergedArray = new int[curLength]; //used to merge two part of array in a sorted manner
        int i=left; //initializing index of left array
        int j=mid+1; //initializing index of right array
        int k=0; //initializing index of merged array

        while(i<=mid && j<=right){
            if(array[i]<=array[j]){
                mergedArray[k]=array[i];
                i++;
                k++;
            }
            else{
                mergedArray[k]=array[j];
                j++;
                k++;
            }
        }

        //if there is any left over
        while(i<=mid){
            mergedArray[k]=array[i];
            i++;
            k++;
        } 
        while(j<=right){
            mergedArray[k]=array[j];
            j++;
            k++;
        }

        //copy back to original array
        for(int l=0;l<curLength;l++){
            array[left+l]=mergedArray[l];
        }
    }

    public static void sort(char[] array){
        mergeSort(array, 0, array.length-1);
    }

    private static void mergeSort(char[] array, int left, int right){
        int mid = left + ((right-left)/2);

        if(left<right){
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array,left,mid,right);
        }
    }

    private static void merge(char[] array, int left, int mid, int right){
        int curLength = (right-left)+1; //current length of array we are working on
        char[] mergedArray = new char[curLength]; //used to merge two part of array in a sorted manner
        int i=left; //initializing index of left array
        int j=mid+1; //initializing index of right array
        int k=0; //initializing index of merged array

        while(i<=mid && j<=right){
            if(array[i]<=array[j]){
                mergedArray[k]=array[i];
                i++;
                k++;
            }
            else{
                mergedArray[k]=array[j];
                j++;
                k++;
            }
        }

        //if there is any left over
        while(i<=mid){
            mergedArray[k]=array[i];
            i++;
            k++;
        } 
        while(j<=right){
            mergedArray[k]=array[j];
            j++;
            k++;
        }

        //copy back to original array
        for(int l=0;l<curLength;l++){
            array[left+l]=mergedArray[l];
        }
    }
}
