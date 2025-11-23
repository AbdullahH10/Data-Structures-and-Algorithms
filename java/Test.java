import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //START BinarySearch test
        ArrayList<Integer> intList = new ArrayList<>(List.of(10,12,13,15,19,21,33,45,46,47,58,69,70,71,75,80,82,94,99,100));
        ArrayList<Character> charList = new ArrayList<>(List.of('A','C','D','R','a','b','e','i','j'));
        long startTime = System.currentTimeMillis();
        System.out.println("Found Integer: "+BinarySearch.search(intList, 100));
        System.out.println("Time: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        System.out.println("Found Character: "+BinarySearch.search(charList, 'j'));
        System.out.println("Time: "+(System.currentTimeMillis()-startTime)+"ms");
        //END BinarySearch test
    }
}