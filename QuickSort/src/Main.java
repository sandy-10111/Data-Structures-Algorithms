public class Main {
    public static void main(String[] args) {
        int []array ={7,5,3,6,2,4,1,8,0};
        quickSort(array,0,array.length -1);
        for(int i : array){
            System.out.print(array[i] +" ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot -1);    //We now sort the left part of the pivot (everything smaller than the pivot).
        quickSort(array, pivot +1,end);

    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i= start -1;

        for(int j =start; j<= end -1;j++){
            if(array[j] <pivot) {
                i++;
                int temp =array[i];
                array[i] =array[j];
                array[j] =temp;
            }
        }
        i++;
        int temp =array[i];
        array[i] =array[end];
        array[end] =temp;
        return i;
    }
}