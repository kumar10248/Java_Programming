import java.util.PriorityQueue;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        // Create a max heap (priority queue) to store elements in descending order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Insert all elements into the max heap
        for (int num : nums) {
            maxHeap.offer(num);
        }

        // Find the maximum element in the heap, which is the peak element in the array
        int peak = maxHeap.poll();

        // Find the index of the peak element in the original array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == peak) {
                return i;
            }
        }

        // This line should not be reached in a valid scenario
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int result1 = findPeakElement(nums1);
        System.out.println("Output for Example 1: " + result1);

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int result2 = findPeakElement(nums2);
        System.out.println("Output for Example 2: " + result2);
    }
}
