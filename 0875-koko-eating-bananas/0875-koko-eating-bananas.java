class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int a = 1;
        int b = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            b = Math.max(b, nums[i]);
        }
        while(a <= b){
            int c = (a + b) / 2;
            if(isValid(c, nums, h)){
                ans = c;
                b = c - 1;
            }else{
                a = c + 1;
            }
        }
        return ans;
    }
    public boolean isValid(int a, int[] nums, int h){
        int b = 0;
        for(int i = 0; i < nums.length; i++){
            b += (nums[i] + a - 1) / a;
            if(b > h){
                return false;
            }
        }
        return true;
    }
}