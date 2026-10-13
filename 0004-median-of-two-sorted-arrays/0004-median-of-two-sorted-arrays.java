class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int m = nums1.length;
        int min = m<n?m:n;
        int[] arr = new int[n+m];
        int y=0, i;
        for(i=0;i<min;i++){
            arr[y++]=nums1[i];
            arr[y++]=nums2[i];
        }
        if(m>n){
            for(int z=i;z<m;z++)
            arr[y++]=nums1[z];
        }
        else if(m<n){
            for(int z=i;z<n;z++)
            arr[y++]=nums2[z];
        }
        Arrays.sort(arr);;
        double median=0;
        if((m+n)%2==0){
            median = (double)(arr[(m+n)/2]+arr[((m+n)/2)-1])/2;
        }else 
            median = (double)arr[(m+n)/2];
        return median;
    }
}