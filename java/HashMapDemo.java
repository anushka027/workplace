import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap < String,Integer > map = new HashMap<>();
        map.put("a",10);
        map.put("b",20);
        System.out.println(map);
        System.out.println(map.size());
        Integer a = map.get("a");
        System.out.println(a);
    

        for (String key : map.keySet()){
            System.out.println(map.get (key));
        }

        for (Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println( entry.getKey() + "," + entry.getValue());
        }
    }
}
