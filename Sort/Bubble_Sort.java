import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bubble_Sort {
    
    public static void bubbleSort(List<Integer> nums){
        for(int i=0;i<nums.size()-1;i++){
            for(int j=0;j<nums.size()-1;j++){
                if(nums.get(j)>nums.get(j+1)){
                    Collections.swap(nums, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sizeOfInput = sc.nextInt();
        List<Integer> input = new ArrayList<Integer>(sizeOfInput);

        for(int i=0;i<sizeOfInput;i++){
            input.add(sc.nextInt());
        }
        sc.close();

        bubbleSort(input);

        for(int i=0;i<sizeOfInput;i++){
            System.out.print(input.get(i)+" ");
        }
    }
}
