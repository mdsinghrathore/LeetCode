class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int least = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > least) {
                least = nums[i];
            }
        }
        int ans = sum;
        while (least <= sum) {
            int a = least + (sum - least) / 2;
            if (isValid(nums, a, k)) {
                ans = a;
                sum = a - 1;
            } else {
                least = a + 1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] nums, int maxSum, int k) {
        int count = 1;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] <= maxSum) {
                currentSum += nums[i];
            } else {
                count++;
                currentSum = nums[i];
            }
        }
        return count <= k;
    }
}