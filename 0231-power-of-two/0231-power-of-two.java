class Solution {
    public boolean isPowerOfTwo(int n) {
        int a =0;
        int b=0;
        while(n>a && b<31){
            a = (int)Math.pow(2,b);
            if(n<a){
                return false;
            }
            if(n==a){
                return true;
            }
            b++;
        }
        return false;
    }
}