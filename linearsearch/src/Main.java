public class Main {
    public static void main(String[] args) {

        int[] array = {7,8,5,4,6,9,87,10};

        int index = LinearSearch(array ,10);

        if(index != -1){
            System.out.println("indes is found: "+ index);
        }
        else{
            System.out.println("index not found");
        }
    }

    private static int LinearSearch(int[] array, int value) {
        for(int i =0; i<array.length;i++){
          if(array[i] == value){
              return i;
          }
    }
        return -1;


}
}