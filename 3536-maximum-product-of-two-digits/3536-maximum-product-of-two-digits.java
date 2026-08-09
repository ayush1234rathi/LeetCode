class Solution {
    public int maxProduct(int n) {
        int x=0, y=0;
        while(n>0){
            int a=n%10;
            n/=10;
            if(a>=x){
                y=x;
                x=a;
            }
            else if(a>y && a<x) y=a;
        }
        return x*y;
    }
}