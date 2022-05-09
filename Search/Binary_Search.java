/*
binarySearch method takes two arguments:
    - A List of numbers or letters
    - A key that we need to search

If the key is found on the given List then the index of the key is returned otherwise the method returns -1.
*/


import java.util.List;

public class Binary_Search {
    public static long binarySearch(List<Long> nums, long key){
        long left = 0;
        long right = nums.size()-1;

        if(nums.size()==0 || nums == null){
            return -1;
        }

        while(left<=right){
            long mid =  left + ((right-left)/2);

            if(nums.get(mid)==key) return nums.indexOf(key);
            else if(key<nums.get(mid)) right = mid-1;
            else left = mid+1;
        }

        return -1;
    }

    public static long binarySearch(List<Character> letters, char key){
        long left = 0;
        long right = letters.size()-1;

        if(letters.size()==0 || letters == null){
            return -1;
        }

        while(left<=right){
            long mid =  left + ((right-left)/2);

            if(letters.get(mid)==key) return letters.indexOf(key);
            else if(key<letters.get(mid)) right = mid-1;
            else left = mid+1;
        }

        return -1;
    }
}
