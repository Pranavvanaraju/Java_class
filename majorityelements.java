import java.util.*;

public class majorityelements {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3,3,3};

        Arrays.sort(nums);

        int majority = nums[nums.length / 2];

        System.out.println("Majority Element: " + majority);
    }
}