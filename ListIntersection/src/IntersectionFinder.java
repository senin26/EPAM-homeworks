import java.util.*;

public class IntersectionFinder {

    private List<Object> list1;
    private List<Object> list2;


    public IntersectionFinder(List<Object> list1, List<Object> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public List getIntersectionUsingArrayList() {
        List<Object> listIntersect = new ArrayList<>();
        for (Object o1:
             list1) {
            for (Object o2:
                 list2) {
                if (o1.equals(o2)) {
                    listIntersect.add(o1);
                }
            }
        }
        return listIntersect;
    }

    public List getIntersectionUsingIterator() {
        List<Object> tempList = new ArrayList<>(list1);
        Iterator<Object> iterator = tempList.iterator();
        while(iterator.hasNext()) {
            if (!list2.contains(iterator.next())) {
                iterator.remove();
            }
        }
        return tempList;
    }

}
