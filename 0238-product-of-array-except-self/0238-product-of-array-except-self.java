class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int[] brr=new int[nums.length];
            int a=1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                arr[i]=a;
            }
            else{
                arr[i]=nums[i-1]*a;
            }
                a=arr[i];
        }
            int b=1;
        for(int j=nums.length-1;j>=0;j--){
            if(j==(nums.length-1)){
                brr[j]=b;
            }
            else{
                brr[j]=b*nums[j+1];
            }
            b=brr[j];
        }
        for(int k=0;k<nums.length;k++){
            nums[k]=arr[k]*brr[k];
        }
        return nums;
    }
}