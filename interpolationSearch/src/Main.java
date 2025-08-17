public class Main {
    public static void main(String[] args) {
       int [] array = {1,2,3,4,5,6,7,8,9,10};
       int index = interpolationSearch(array, 8);

    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length-1;
        int low =0;

        while(value >=array[low] && value <= array[high] && low <= high){

            int probe = low+ (high - low)* (value - array[low]) / (array[high] - array[low]);

            System.out.println("probe: "+ probe);

            if(array[probe] == value){
                return probe;
            } else if (array[probe] < value) {
                low = probe +1;
            }
            else{
                high = probe -1;
            }
        }
        return 0;
    }
}