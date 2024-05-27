import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedList{

    public static List<Integer> mergeAndSortDescending(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();

        // Merge the two lists
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Sort the merged list in descending order
        Collections.sort(mergedList, Collections.reverseOrder());

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(3, 5);
        List<Integer> b = List.of(2, 6, 7, 10);

        List<Integer> result = mergeAndSortDescending(a, b);
        System.out.println(result);
    }
}
