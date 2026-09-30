class Solution {
    public int findMin(int[] nums) {
        int a=0;
        int b=nums.length-1;
        int c=0;
        if(b==0){
            return nums[b];
        }
        while(a<b){
            c= (a+b)/2;
            if(nums[b]<nums[c]){
                a=c+1;
            }else{
                b=c;
            }
        }
        return nums[a];
    }
}