class Solution {
    public int search(int[] nums, int target) {
        int a = 0;
        int b = nums.length - 1;
        while (a <= b) {
            int d = (a + b) / 2;
            if (nums[d] == target) {
                return d;
            }
            if (nums[a] <= nums[d]) {
                if (nums[a] <= target && target < nums[d]) {
                    b = d - 1;
                } else {
                    a = d + 1;
                }
            } 
            else {
                if (nums[d] < target && target <= nums[b]) {
                    a = d + 1;
                } else {
                    b = d - 1;
                }
            }
        }
        return -1;
    }
}