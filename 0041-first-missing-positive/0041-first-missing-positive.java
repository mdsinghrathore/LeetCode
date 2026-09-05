class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int b=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==1){
                b=i;
            }
        }
        int a=1;

            for(int j=b;j<nums.length-1;j++){
                if(nums[j]==a){
                    if(nums[j]<nums[j+1]){
                        a++;
                    }
                }else{
                    return a;
                }
            }
            if(nums[nums.length-1]==a){
                return a+1;
            }else{
                return a;
            }
    }
}