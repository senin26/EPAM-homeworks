import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>(Arrays.asList("a", "b", "g", 3, "u", "344"));
        List<Object> list2 = new ArrayList<>(Arrays.asList("a", "bu", "g6563", "u", "344", 3));
        IntersectionFinder intersectionFinder = new IntersectionFinder(list1, list2);
        System.out.println(intersectionFinder.getIntersectionUsingArrayList() + "\n");
        System.out.println(intersectionFinder.getIntersectionUsingIterator() + "\n");
    }
}
