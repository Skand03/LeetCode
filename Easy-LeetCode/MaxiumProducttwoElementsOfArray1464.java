class MaximunProducts {
    public static int maximumTwoProductNumber(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int maxValue = (nums[i] - 1) * (nums[j] - 1);
                if (maxValue > max) {
                    max = maxValue;
                }
            }
        }
        return max;
    }
}

public class MaxiumProducttwoElementsOfArray1464 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 7 };
        System.out.println(MaximunProducts.maximumTwoProductNumber(nums));
    }
}
