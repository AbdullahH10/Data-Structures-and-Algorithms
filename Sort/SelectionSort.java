/*
The idea of selection sort is to select the lower bound element l and then find the minimum from rest of
(n-l) elements in the array. If element at index l is greater than the found minmum then we swap.
Algorithm:
    1. l=0 to l=n-2
    2. Find minimum element from (n-l) elements and store value in  cur_min
    3. If nums[l] is greater than cur_min swap
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(List<Integer> nums){
        for(int l=0;l<nums.size()-2;l++){
            int i=l+1;
            int cur_min=Integer.MAX_VALUE;
            while(i<nums.size()){
                if(nums.get(i)<cur_min){
                    cur_min=nums.get(i);
                }
                i++;
            }
            if(nums.get(l)>cur_min){
                Collections.swap(nums, l, nums.indexOf(cur_min));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfInput = sc.nextInt();
        List<Integer> input = new ArrayList<>(sizeOfInput);

        for(int i=0;i<sizeOfInput;i++){
            input.add(sc.nextInt());
        }
        sc.close();

        selectionSort(input);

        for(int i=0;i<sizeOfInput;i++){
            System.out.print(input.get(i)+" ");
        }
    }
}
