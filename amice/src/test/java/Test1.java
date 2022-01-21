import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;

/**
 * @author maodianchu
 * @ClassName Test1
 * @Description
 * @date 2021/12/30 15:54
 */
public class Test1 {

    public static void main(String[] args) {
        Multimap<String,Object> myMultimap = ArrayListMultimap.create();
        // Adding some key/value
        myMultimap.put("Fruits", "Bannana");
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");

        Collection<Object> fruits = myMultimap.get("Fruits");
        fruits.forEach(e -> System.out.println(e));
    }
}
