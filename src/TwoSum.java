public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Return the pair of numbers that add up to the target
                    return new int[]{nums[i], nums[j]};
                }
            }
        }

        // If no such pair is found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        System.out.println("Output: (" + result[0] + ", " + result[1] + ")");
    }
}
