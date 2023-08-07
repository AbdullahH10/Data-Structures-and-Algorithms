/*
The randomized quick sort here chooses the pivot randomly thus resulting in O(nlogn) runnning time. If we
choose left as pivot always then running time will be O(n^2).
*/
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i]= array[j];
        array[j]= tmp;
    }


    public static void quickSort(int[] nums, int left, int right){
        if(left<right){
            int curSortedPosition = partition(nums, left, right);
            quickSort(nums, left, curSortedPosition-1);
            quickSort(nums, curSortedPosition+1, right);
        }
    }

    public static int partition(int[] nums, int left, int right){
        Random random = new Random();
        //int pivotIndex = left; //when left is always pivot, O(n^2)
        int pivotIndex = (int)Math.random()*((right+1)-left+1)+left; //when a random index is pivot, O(nlogn)
        int pivot = nums[pivotIndex];
        int sortedPos = left;

        for(int i=left+1;i<=right;i++){
            if(nums[i]<pivot || (nums[i]==pivot && random.nextInt(1000)%2==0)){
                sortedPos++;
                swap(nums, i, sortedPos);
                System.out.print("Swapped : "+sortedPos+" "+i+"\n");
            }
        }
        System.out.print("Sorted Pos: "+sortedPos+"\n");
        swap(nums, left, sortedPos);

        return sortedPos;
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
