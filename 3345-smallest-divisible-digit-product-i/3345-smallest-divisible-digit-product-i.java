class Solution {
    public int smallestNumber(int n, int t) {
        int ans=n,p=1,temp=n;
        while(p%t!=0){
            while(temp>0){
                p*=(temp%10);
                temp/=10;
            }
            if(p%t==0)  break;
            temp=++ans;
            p=1;
        }
        return ans;
    }
}