public class SelectionSort {
    public static void sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int indexOfSelectedValueFromTheArray = i;
            int selectedValueFromTheArray = array[i];
            int indexOfMinimumValueFromRestOfTheArray = findMinimum(array,i+1);
            int minimumValueFromRestOfTheArray = array[indexOfMinimumValueFromRestOfTheArray];
            if(minimumValueFromRestOfTheArray<selectedValueFromTheArray){
                swap(array,indexOfSelectedValueFromTheArray,indexOfMinimumValueFromRestOfTheArray);
            }
        }
    }

    private static int findMinimum(int[] array, int start){
        int minimum = Integer.MAX_VALUE;
        int indexOfMinimum = -1;
        for(int i=start;i<array.length;++i){
            if(array[i]<minimum){
                minimum = array[i];
                indexOfMinimum = i;
            }
        }

        return indexOfMinimum;
    }

    private static void swap(int[] array, int pos1, int pos2){
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public static void sort(char[] array){
        for(int i=0;i<array.length-1;i++){
            int indexOfSelectedValueFromTheArray = i;
            char selectedValueFromTheArray = array[i];
            int indexOfMinimumValueFromRestOfTheArray = findMinimum(array,i+1);
            char minimumValueFromRestOfTheArray = array[indexOfMinimumValueFromRestOfTheArray];
            if(minimumValueFromRestOfTheArray<selectedValueFromTheArray){
                swap(array,indexOfSelectedValueFromTheArray,indexOfMinimumValueFromRestOfTheArray);
            }
        }
    }

    private static int findMinimum(char[] array, int start){
        char minimum = Character.MAX_VALUE;
        int indexOfMinimum = -1;
        for(int i=start;i<array.length;++i){
            if(array[i]<minimum){
                minimum = array[i];
                indexOfMinimum = i;
            }
        }

        return indexOfMinimum;
    }

    private static void swap(char[] array, int pos1, int pos2){
        char temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
