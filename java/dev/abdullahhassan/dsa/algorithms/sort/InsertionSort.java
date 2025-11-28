public class InsertionSort {
    public static void sort(int[] array){
        for(int i=1;i<array.length;i++){
            int toBeSorted = array[i];
            int j=i-1;
            while(j>=0 && array[j]>toBeSorted){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=toBeSorted;
        }
    }

    public static void sort(char[] array){
        for(int i=1;i<array.length;i++){
            char toBeSorted = array[i];
            int j=i-1;
            while(j>=0 && array[j]>toBeSorted){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=toBeSorted;
        }
    }
}
