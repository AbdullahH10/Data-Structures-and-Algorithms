import java.util.Arrays;
import java.util.Scanner;

public class  QuickSort {
    public static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i]= array[j];
        array[j]= tmp;
    }


    public static void quickSort(int[] nums, int left, int right){
        if(left<right){
            int partitionedPosition = partition(nums, left, right);
            if(partitionedPosition != 0) quickSort(nums, left, partitionedPosition-1);
            if(partitionedPosition != nums.length-1) quickSort(nums, partitionedPosition+1, right);
        }
    }

    public static int partition(int[] nums, int left, int right){
        int pivotIndex = (int) (left+(Math.floor((right-left)/2.0)));
        int pivot = nums[pivotIndex];
        System.out.println(Arrays.toString(nums) +" "+left+" "+right+" pivot: "+pivot);

        int i=left;
        int j=left-1;
        while(i<=right){
            if(nums[i]<pivot){
                j++;
                swap(nums,i,j);
            }
            i++;
        }
        swap(nums,++j,pivotIndex);
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfInput = sc.nextInt();

        int[] input = new int[sizeOfInput];

        for(int i=0;i<sizeOfInput;i++){
            input[i]=sc.nextInt();
        }
        sc.close();

        quickSort(input,0,sizeOfInput-1);

        for(int i=0;i<sizeOfInput;i++){
            System.out.print(input[i]+" ");
        }
    }
}
