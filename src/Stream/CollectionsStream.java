package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class CollectionsStream {
    public static void main(String[] args) {

        //Converting List into Stream
        List<String> list = Arrays.asList("Vicky", "Sunny", "Ayush","Shiva");
        Stream<String> myStream= list.stream().filter(x->x.charAt(0)=='S');
        System.out.println(myStream);
        myStream.forEach(System.out::println);

        //Converting Arrays into Stream
        String[] arr={"Vicky", "Sunny", "Ayush", "Shiva", "Ansh", "Vijay"};
        Stream<String> myArraysStream= Arrays.stream(arr).filter(x-> x.charAt(0)=='A');
        myArraysStream.forEach(System.out::println);

        //Directly We can Create Stream
        //We can Create in Two Ways
        //a.>
        Stream<Integer> dm=Stream.of(1,2,3,4);
        dm.forEach(System.out::println);

        //b.>
        Stream<Integer> limit=Stream.iterate(1,n->n+1).limit(15);
        limit.forEach(System.out::println);
    }
}
