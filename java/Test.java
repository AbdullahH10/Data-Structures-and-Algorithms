import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] intArray;
        char[] charArray;
        ArrayList<Integer> intList = new ArrayList<>(List.of(10,12,13,15,19,21,33,45,46,47,58,69,70,71,75,80,82,94,99,100));
        ArrayList<Character> charList = new ArrayList<>(List.of('A','C','D','R','a','b','e','i','j'));
        
        
        //START BinarySearch test
        System.out.println("Found Integer at index: "+BinarySearch.search(intList, 100));
        System.out.println("Found Character at index: "+BinarySearch.search(charList, 'j'));
        //END BinarySearch test

        //START BubbleSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        BubbleSort.sort(intArray);
        BubbleSort.sort(charArray);
        System.out.println("Sorted: " + Arrays.toString(intArray));
        System.out.println("Sorted: " + Arrays.toString(charArray));
        //END BubbleSort test

        //START InsertionSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        InsertionSort.sort(intArray);
        InsertionSort.sort(charArray);
        System.out.println("Sorted: " + Arrays.toString(intArray));
        System.out.println("Sorted: " + Arrays.toString(charArray));
        //END InsertionSort test

        //START MergeSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        MergeSort.sort(intArray);
        MergeSort.sort(charArray);
        System.out.println("Sorted: " + Arrays.toString(intArray));
        System.out.println("Sorted: " + Arrays.toString(charArray));
        //END MergeSort test

        //START QuickSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        QuickSort.sort(intArray);
        QuickSort.sort(charArray);
        System.out.println("Sorted: " + Arrays.toString(intArray));
        System.out.println("Sorted: " + Arrays.toString(charArray));
        //END QuickSort test

        //START SelectionSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        SelectionSort.sort(intArray);
        SelectionSort.sort(charArray);
        System.out.println("Sorted: " + Arrays.toString(intArray));
        System.out.println("Sorted: " + Arrays.toString(charArray));
        //END SelectionSort test
    }
}