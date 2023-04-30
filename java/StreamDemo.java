import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args){

        List<Integer> numberlist = new ArrayList<>();
         numberlist.add(10);
         numberlist.add(11);
         numberlist.add(12);
         numberlist.add(13);
          
        //  List<Integer> squarelist = new ArrayList<>();
        //  for(Integer i : numberlist){
        //     squarelist.add(i*i);
        //  }

        // stream syntax
         List<Integer> squarelist = numberlist.stream().map(x -> x*x).collect(Collectors.toList());
         System.out.println(squarelist);

        //  Set<Integer> square1list = new HashSet<>();
        //  for(Integer i : numberlist){
        //     square1list.add(i*2);
        //  }

        // stream syntax
         Set<Integer> square1list = numberlist.stream().map(x -> x*x).collect(Collectors.toSet());
         System.out.println(square1list);

        //  2nd

        List<String> languages = new ArrayList<>();
         languages.add("Java");
         languages.add("Kotlin");
         languages.add("Python");
         languages.add("kimp");
          
        //  List<String> result = new ArrayList<>();
        //  for(String s : languages ){
        //     if(s.startsWith("K"))
        //     result.add(s);
        //  }

        // stream syntax
         List<String> result = languages.stream().filter(s -> s.startsWith("K")).collect(Collectors.toList());
         System.out.println(result);

         // sorting and iteration
         List<String> sort = languages.stream().sorted().collect(Collectors.toList());
         System.out.println(sort);

         languages.stream().forEach(x -> {System.out.println(x);
            System.out.println(x.startsWith("k"));});

            //numbers

            List<Integer> numbers = new ArrayList<>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);
         numbers.add(40);

         int sum  = numbers.stream().reduce(0,(ans,i) -> ans+i);
         System.out.println(sum);

    }
}
