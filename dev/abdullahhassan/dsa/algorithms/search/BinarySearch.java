package dev.abdullahhassan.dsa.algorithms.search;

import java.util.List;

public class BinarySearch {
    /*
        search method takes two arguments:
            
            - A List of numbers or characters
            - A key that we need to search

        If the key is found on the given List then the index of the key is returned otherwise the method returns -1.
    */
    
    public static int search(List<Integer> list, Integer key){
        int left = 0;
        int right = list.size()-1;

        if(list.size() == 0 || list == null){
            return -1;
        }

        while(left <= right){
            int mid =  left + ((right-left)/2);
            if(list.get(mid).equals(key))
                return list.indexOf(key);
            else if(key.intValue() < list.get(mid).intValue())
                right = mid-1;
            else
                left = mid+1;
        }

        return -1;
    }

    public static long search(List<Character> list, Character key){
        int left = 0;
        int right = list.size()-1;

        if(list.size() == 0 || list == null){
            return -1;
        }

        while(left <= right){
            int mid =  left + ((right-left)/2);
            if(list.get(mid).equals(key))
                return list.indexOf(key);
            else if(key.charValue() < list.get(mid).charValue())
                right = mid-1;
            else
                left = mid+1;
        }

        return -1;
    }
}
