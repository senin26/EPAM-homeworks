import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSorter {

    private String[] unsortedStrArray;
    private int res = 0;

    public StringSorter(String[] unsortedStrArray) {
        this.unsortedStrArray = unsortedStrArray;
    }

    public String[] sort() {
        List<String> list = new ArrayList(Arrays.asList(unsortedStrArray));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(0) > o2.charAt(0)) {
                    res = 1;
                    //return 1; //todo why this doesn't work?
                }
                else if (o1.charAt(0) < o2.charAt(0)){
                    res = -1;
                    //return -1; //todo why this doesn't work?
                }
                else if ((o1.charAt(0) == o2.charAt(0)) && (!(o1.substring(1)).isEmpty()) && (!(o2.substring(1)).isEmpty())) {
                    res = 0;
                    this.compare(o1.substring(1), o2.substring(1));
                }
                return res;
            }
        });
        String[] sortedArray = new String[list.size()];
        sortedArray = list.toArray(sortedArray);
        unsortedStrArray = sortedArray;
        return unsortedStrArray;
    }
}
