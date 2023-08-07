import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] nums, int left, int right){
        int mid = left + ((right-left)/2);

        if(left<right){
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums,left,mid,right);
        }
    }

    public static void merge(int[] nums,int left,int mid,int right){
        int cur_length = right-left+1; //current length of nums we are working on
        int[] mergedArray = new int[cur_length]; //used to merge two part of nums in a sorted manner
        int i=left; //initializing index of left array on nums
        int j=mid+1; //initializing index of right array on nums
        int k=0; //initializing index of merged array

        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                mergedArray[k]=nums[i];
                i++;
                k++;
            }
            else{
                mergedArray[k]=nums[j];
                j++;
                k++;
            }
        }

        //if there is any left over
        while(i<=mid){
            mergedArray[k]=nums[i];
            i++;
            k++;
        } 
        while(j<=right){
            mergedArray[k]=nums[j];
            j++;
            k++;
        }

        //copy back to original array nums
        for(int l=0;l<cur_length;l++){
            nums[left+l]=mergedArray[l];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfInput = sc.nextInt();

        int[] input = new int[sizeOfInput];

        for(int i=0;i<sizeOfInput;i++){
            input[i]=sc.nextInt();
        }
        sc.close();

        mergeSort(input,0,sizeOfInput-1);

        for(int i=0;i<sizeOfInput;i++){
            System.out.print(input[i]+" ");
        }
    }
}
