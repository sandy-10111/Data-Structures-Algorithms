import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap= new TreeMap<>();
        treeMap.put(3,"A");
        treeMap.put(2,"B");
        treeMap.put(1,"C");

        treeMap.remove(2);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap);
    }
}