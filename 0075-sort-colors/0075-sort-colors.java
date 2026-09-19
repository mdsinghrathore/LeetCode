class Solution {
    public static void swap(int[] nums,int a,int b)
    {
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==1)
            mid++;
            else if(nums[mid]==0){
            swap(nums,low,mid);
            low++;
            mid++;}
            else
            {
                swap(nums,high,mid);
                high--;
            }
        }
    }
}