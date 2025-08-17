public class Main {
    public static void main(String[] args) {
        int[] array ={9,5,3,6,2,4,1,5,8,7};
        InsertionSort(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void InsertionSort(int[] array) {
        for(int i=1;i< array.length;i++){
            int temp = array[i];
            int j= i - 1;
            while(j >=0 && array[j] > temp){
                array[j +1] = array[j];
                j--;
            }
            array[j +1] =temp;
        }

    }
}