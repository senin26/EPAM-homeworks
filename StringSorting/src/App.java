public class App {

    public static void main(String[] args) {

        System.out.println("\n---------Sorting with Comparator---------\n");
        String[] unsortedArray = {"sorting", "good", "fucking", "sorpink", "goo", "A", "a", "goob"};
        System.out.println("Old unsorted array:\n");
        for (String s :
                unsortedArray) {
            System.out.println(s);
        }
        StringSorter stringSorter = new StringSorter(unsortedArray);
        String[] sortedArray = stringSorter.sort();
        System.out.println("\nNew sorted array:\n");
        for (String s :
                sortedArray) {
            System.out.println(s);
        }

        System.out.println("\n---------Sorting without Comparator---------\n");
        String[] unsortedArray2 = {"sorting", "good", "fucking", "sorpink", "goo", "A", "a", "goob"};
        System.out.println("Old unsorted array:\n");
        for (String s :
                unsortedArray2) {
            System.out.println(s);
        }
        StringSorterNoComparator stringSorter2 = new StringSorterNoComparator(unsortedArray2);
        String[] sortedArray2 = stringSorter2.sort();
        System.out.println("\nNew sorted array:\n");
        for (String s :
                sortedArray2) {
            System.out.println(s);
        }
    }



}
