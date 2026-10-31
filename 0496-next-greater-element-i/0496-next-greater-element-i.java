class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a = nums1[0];
        for(int i =0;i<nums1.length;i++){
            int b =0;
            int c=-1;
            for(int j = 0 ;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    b=j;
                }
            }
            for(int k=b ;k<nums2.length;k++){
                if(nums1[i]<nums2[k]){
                    c= nums2[k];
                    break;
                }
            }
            nums1[i]=c;
        }
        return nums1;
    }
}