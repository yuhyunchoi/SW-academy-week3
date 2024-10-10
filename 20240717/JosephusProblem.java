import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class JosephusProblem {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8);

        System.out.println(list);

        int index = 0;
        while(list.size() > 1){
            index = (index + list.size() - 1) %list.size();
            

        }


    }
    
}
