import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exam02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list, "A", "B", "C", "D", "E","F","G","H","I","J");

        System.out.println(list);

        System.out.println("list.subList(3,8) : " + list.subList(3, 8));
        System.out.println("list.subList(3,8).get(2) : " + (list.subList(3, 8).get(2)));
        System.out.println("list.subList(3,8).set(2,\"B\") : " + list.subList(3, 8).set(2,"B"));
        System.out.println(list);
        System.out.println("list.indexOf(\"B\") : " + list.indexOf("B"));
        System.out.println("list.subList(3,8).indexOf(\"B\") : " + list.subList(3,8).indexOf("B"));
        System.out.println(list);
        System.out.println("Collections.reverse(list.subList(3,8)) : " );
        Collections.reverse(list.subList(3,8));
        System.out.println(list);

    }
    
}
