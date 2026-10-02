class Solution {
    public int shipWithinDays(int[] weight, int days) {
        int sum =0;
        for(int i=0;i<weight.length;i++){
            sum+=weight[i];
        }
        int greatest =0;
        for(int i=0;i<weight.length;i++){
            if(weight[i]>greatest){
                greatest=weight[i];
            }
        }
        System.out.println(sum);
        System.out.println(greatest);

        int a = greatest;
        int b = sum;
        int ans=0;
        while(a<=b){
            int c =(a+b)/2;
            if(isValid(weight,c,days)){
                b=c-1;
                ans = c;
            }else{
                a=c+1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] weight,int c, int days){
        int a = 1;
        int sum = 0;
        for(int i = 0; i < weight.length; i++) {
            if(sum + weight[i] <= c) {
                sum += weight[i];
            } else {
                a++;
                sum = weight[i];
            }
        }
        return a <= days;
    }
}