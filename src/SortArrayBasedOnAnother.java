import java.util.Arrays;
import java.util.Comparator;

public class SortArrayBasedOnAnother {

    public static int[] sortArray(int[] arr1, int[] arr2) {
        Integer[] arr1Wrapper = Arrays.stream(arr1).boxed().toArray(Integer[]::new);

        Arrays.sort(arr1Wrapper, Comparator.comparingInt(element -> {
            int index = Arrays.binarySearch(arr2, element);
            return index < 0 ? arr2.length + element : index;
        }));

        return Arrays.stream(arr1Wrapper).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 4, 7, 6};
        int[] arr2 = {1, 3, 6};

        int[] result = sortArray(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}
