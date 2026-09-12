class Solution {
public:
    double Power(double x, int n) {
        if(n == 0) return 1 ;
        double p = Power(x,n/2);
        if(n % 2 == 0) return p*p;
        else return p*p*x;
    }
    double myPow(double x, int n) {
        if(n<0) return 1/ Power(x,n);
        return Power(x,n);
  
    }
};