class Solution {
    public int divide(long dividend, long divisor) {
        long d = 0;
        long a=1;
        long b= dividend;
        if(divisor==1){
            return (int)dividend;
        }
        if(dividend<0){
            a=-(a);
            dividend=-(dividend);
        }
        if(divisor<0){
            a=-(a);
            divisor=-(divisor);
        }
        while (dividend >= divisor) {
            long temp = divisor;
            long multiple = 1;

            while (dividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dividend -= temp;
            d += multiple;
        }
        if(a<0){
            d=-(d);
        }
        if(d >2147483647){
            return 2147483647;
        }
        return (int)d;
    }
}