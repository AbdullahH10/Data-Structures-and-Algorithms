public class BubbleSort {
    public static void sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] array, int pos1, int pos2){
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    private static void swap2(int[] array, int pos1, int pos2){
        array[pos1] = array[pos1] + array[pos2];
        array[pos2] = array[pos1] - array[pos2];
        array[pos1] = array[pos1] - array[pos2];
    }

    public static void sort(char[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    swap2(array,j,j+1);
                }
            }
        }
    }

    private static void swap(char[] array, int pos1, int pos2){
        char temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    private static void swap2(char[] array, int pos1, int pos2){
        array[pos1] = (char)((int)array[pos1] + (int)array[pos2]);
        array[pos2] = (char)((int)array[pos1] - (int)array[pos2]);
        array[pos1] = (char)((int)array[pos1] - (int)array[pos2]);
    }
}
