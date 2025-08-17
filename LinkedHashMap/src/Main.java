import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();
        words.put("we", 1);
        words.put("of", 2);
        words.put("that", 3);
        words.put("these",2);
        words.put("the",2);
        System.out.println(words);
        System.out.println(words.get("of"));

        if(words.containsKey("we")){
            System.out.println("the key is exist");
        }else{
            System.out.println("the key is not exist");
        }


        if(words.containsKey("so")){
            System.out.println("the key is exist");
        }else{
            System.out.println("the key is not exist");
        }

        System.out.println("the number of linked hash map before remove any element is: "+ words.size());

        words.remove("these");
        System.out.println("the number of linked hash map after remove any element is: "+ words.size());

        for(Map.Entry<String,Integer> word : words.entrySet()){
            System.out.println(word.getKey() +":"+ word.getValue());
        }

        for(String word : words.keySet()){
                System.out.println(words.get(word));

        }


    }
}