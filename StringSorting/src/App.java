public class App {

    public static void main(String[] args) {
        String[] unsortedArray = {"sorting", "good", "fucking", "sorpink", "gooa", "A", "a", "goob"};
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
    }
}
