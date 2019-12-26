import java.util.*;

public class TwoSum {

    // The solution here is to do everything inside one iteration
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public void print(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int num: nums) {sb.append(num + " "); }
        System.out.println(sb.toString());
    }

    public static void main(String args[]) {
        TwoSum s = new TwoSum();

        s.print(s.twoSum(new int[]{2, 7, 11}, 9));
        // should return 0 1

        s.print(s.twoSum(new int[]{3, 3}, 6));
        // should return 0 1

        s.print(s.twoSum(new int[]{3, 1, 3}, 6));
        // should return 0 2
    }
}