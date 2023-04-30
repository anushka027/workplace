import java.util.*;
public class HashSetDemo 
{public static void main(String[] args)
    {
    HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("A");
    hashSet.add("B");
    boolean r1 = hashSet.add("C") ;

    System.out.println(r1);
    boolean r2 = hashSet.add("C") ;

    System.out.println(r2);
    System.out.println(hashSet);
    
    for(String i : hashSet){
        System.out.println(i);
    }

}
}
