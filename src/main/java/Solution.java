import java.util.Arrays;

public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        int firstIndex = 0;
        int secondIndex = 1;
        while (firstIndex < numbers.length) {
            secondIndex = Arrays.asList(nums).lastIndexOf((target - nums[firstIndex]));
            if (secondIndex != -1 && secondIndex != firstIndex) break;
            firstIndex++;
        }
        return new int[]{firstIndex, secondIndex};
    }
}