import java.util.*;

public class StringSorterNoComparator {

    private String[] unsortedStrArray;
    private int res = 0;

    public StringSorterNoComparator(String[] unsortedStrArray) {
        this.unsortedStrArray = unsortedStrArray;
    }

    public String[] sort() {
        List<String> list = new ArrayList(Arrays.asList(unsortedStrArray));
        int minIndex;
        int maxIndex;
        for (String out:
                unsortedStrArray) {
            for (String in:
                 list) {
                if (out.compareTo(in)<0 && (list.indexOf(out)>list.indexOf(in))) {
                    minIndex = list.indexOf(in);
                    maxIndex = list.indexOf(out);
                    list.set(minIndex, out);
                    list.set(maxIndex, in);
                }
                if (out.compareTo(in)>0 && (list.indexOf(out)<list.indexOf(in))) {
                    minIndex = list.indexOf(out);
                    maxIndex = list.indexOf(in);
                    list.set(minIndex, in);
                    list.set(maxIndex, out);
                }
            }
        }
        String[] sortedArray = new String[list.size()];
        sortedArray = list.toArray(sortedArray);
        unsortedStrArray = sortedArray;
        return unsortedStrArray;
    }


}
