import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] nums){
        for(int i=1;i<nums.length;i++){
            int toBeSorted = nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>toBeSorted){
                nums[j+1]=nums[j];
                j--;
            }

            nums[j+1]=toBeSorted;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfInput = sc.nextInt();
        int[] input = new int[sizeOfInput];

        for(int i=0;i<sizeOfInput;i++){
            input[i] = sc.nextInt();
        }
        sc.close();

        insertionSort(input);

        for(int i=0;i<sizeOfInput;i++){
            System.out.print(input[i]+" ");
        }
    }
}
