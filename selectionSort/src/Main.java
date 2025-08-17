public class Main {
    public static void main(String[] args) {
      int [] array = {9,5,7,4,8,2,1,3,6};

      selectionsort(array);

      for(int i : array){
          System.out.println(i);
      }
    }

    private static void selectionsort(int[] array) {
        for(int i =0;i<array.length;i++){
            int min = i;
            for(int j = i+1 ;j<array.length;j++){
                if(array[min]> array[j]){
                    min = j;
                }
            }
           int temp = array[i];
            array[i] =array[min];
            array[min] =temp;
        }
    }

}