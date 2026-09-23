class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        int a = 0;
        int b = nums.length - 1;
        while (a <= b) {
            int c = (a + b) / 2;
            if (nums[c] == target) {
                arr[0] = c;
                b = c - 1;       
            } 
            else if (nums[c] > target) {
                b = c - 1;
            } 
            else {
                a = c + 1;
            }
        }
        a = 0;
        b = nums.length - 1;
        while (a <= b) {
            int c = (a + b) / 2;
            if (nums[c] == target) {
                arr[1] = c;
                a = c + 1;       
            } 
            else if (nums[c] > target) {
                b = c - 1;
            } 
            else {
                a = c + 1;
            }
        }
        return arr;
    }
}