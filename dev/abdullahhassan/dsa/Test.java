package dev.abdullahhassan.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.abdullahhassan.dsa.algorithms.search.*;
import dev.abdullahhassan.dsa.algorithms.search.graph.*;
import dev.abdullahhassan.dsa.algorithms.sort.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(List.of(10,12,13,15,19,21,33,45,46,47,58,69,70,71,75,80,82,94,99,100));
        ArrayList<Character> charList = new ArrayList<>(List.of('A','C','D','R','a','b','e','i','j'));
        
        //START BinarySearch test
        System.out.println("Found Integer at index: "+BinarySearch.search(intList, 100));
        System.out.println("Found Character at index: "+BinarySearch.search(charList, 'j'));
        //END BinarySearch test

        int[] intArray;
        char[] charArray;

        //START BubbleSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        BubbleSort.sort(intArray);
        BubbleSort.sort(charArray);
        System.out.println("Sorted by Bubble Sort: " + Arrays.toString(intArray));
        System.out.println("Sorted by Bubble Sort: " + Arrays.toString(charArray));
        //END BubbleSort test

        //START InsertionSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        InsertionSort.sort(intArray);
        InsertionSort.sort(charArray);
        System.out.println("Sorted by Insertion Sort: " + Arrays.toString(intArray));
        System.out.println("Sorted by Insertion Sort: " + Arrays.toString(charArray));
        //END InsertionSort test

        //START MergeSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        MergeSort.sort(intArray);
        MergeSort.sort(charArray);
        System.out.println("Sorted by Merge Sort: " + Arrays.toString(intArray));
        System.out.println("Sorted by Merge Sort: " + Arrays.toString(charArray));
        //END MergeSort test

        //START QuickSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        QuickSort.sort(intArray);
        QuickSort.sort(charArray);
        System.out.println("Sorted by Quick Sort: " + Arrays.toString(intArray));
        System.out.println("Sorted by Quick Sort: " + Arrays.toString(charArray));
        //END QuickSort test

        //START SelectionSort test
        intArray = new int[]{5,8,4,2,1,3,6,9,7,0};
        charArray = new char[]{'j','c','e','g','i','a','d','b','f','h'};
        SelectionSort.sort(intArray);
        SelectionSort.sort(charArray);
        System.out.println("Sorted by Selection Sort: " + Arrays.toString(intArray));
        System.out.println("Sorted by Selection Sort: " + Arrays.toString(charArray));
        //END SelectionSort test

        //START building Graph with Nodes
        Node park = new Node("Park");
        Node cityCounsil = new Node("City Council");
        Node groceryShop = new Node("Grocery Shop");
        Node cafe = new Node("Cafe");
        Node library = new Node("Library");
        Node restaurant = new Node("Restaurant");
        Node butcher = new Node("Butcher");
        Node bakery = new Node("Bakery");
        park.setNeighbours(List.of(cityCounsil,groceryShop));
        cityCounsil.setNeighbours(List.of(park,restaurant));
        groceryShop.setNeighbours(List.of(park,cafe,butcher));
        cafe.setNeighbours(List.of(library,bakery,groceryShop));
        library.setNeighbours(List.of(restaurant,cafe,bakery));
        restaurant.setNeighbours(List.of(cityCounsil,library,bakery));
        butcher.setNeighbours(List.of(groceryShop,bakery));
        bakery.setNeighbours(List.of(butcher,cafe,library,restaurant));
        //END building Graph with Nodes

        //START building Graph with Edges
        ArrayList<Edge> edges = new ArrayList<>(List.of(
            new Edge("Park", "City Council"),
            new Edge("Park", "Grocery Shop"),
            new Edge("Grocery Shop", "Cafe"),
            new Edge("Cafe", "Library"),
            new Edge("Library", "Restaurant"),
            new Edge("Grocery Shop", "Butcher"),
            new Edge("Cafe", "Bakery"),
            new Edge("Library", "Bakery"),
            new Edge("Restaurant", "Bakery"),
            new Edge("Butcher", "Bakery"),
            new Edge("City Council", "Restaurant")
        ));
        Graph graph = new Graph(edges);
        //END building Graph with Edges

        //START BreadthFirstSearch test
        String result = BreadthFirstSearch.search(park, "Library");
        System.out.println("BFS: " + result);
        //END BreadthFirstSearch test

        //START DepthFirstSearch test
        result = BreadthFirstSearch.search(bakery, "Bank");
        System.out.println("DFS: " + result);
        //END DepthFirstSearch test

        //START BreadthFirstSearch test
        result = BreadthFirstSearch.search(graph, "Park", "Library");
        System.out.println("Recursive BFS: " + result);
        //END BreadthFirstSearch test

        //START DepthFirstSearch test
        result = DepthFirstSearch.search(graph, "Park", "Bank");
        System.out.println("Recursive DFS: " + result);
        //END DepthFirstSearch test
    }
}