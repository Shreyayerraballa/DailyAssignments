
    import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Collectors{
    public static void main(String[] args){
        ArrayList<String>ar=new ArrayList<String>();
        ar.add("this is a concept of ");
        ar.add(" Streams ");
        ar.add("in this we are going to learn how to ");
        ar.add("methods of streams");
         ar.stream().flatMap(e -> Stream.of(e)).forEach(System.out::print);
         System.out.println();
       List<String> n =  ar.stream().flatMap(e -> Stream.of(e)).collect(Collectors.toList());
       System.out.println(n);
    }
}

