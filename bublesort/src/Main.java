public class Main {
    public static void main(String[] args) {
        int []array ={9,5,4,7,8,3,2,6,1,0};
        bubbleSort(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void bubbleSort(int[] array) {
        for(int i =0; i<array.length-1; i++){
            for(int j =0; j<array.length-i-1; j++){  //we put -i to After each pass (each outer loop iteration), the largest element is already "bubbled" to the correct position at the end.So, no need to compare it again in the next pass.
              if(array[j]> array[j+1]){
                int  temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
              }
            }
        }
    }
}