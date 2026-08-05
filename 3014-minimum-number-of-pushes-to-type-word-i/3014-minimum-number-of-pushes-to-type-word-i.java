class Solution {
    public int minimumPushes(String word) {
        int n=word.length(), ans=0;
        ans=n/24;
        if(ans>0)   return 4*(n%24)+8+16+24;
        ans=n/16;
        if(ans>0)   return 3*(n%16)+8+16;
        ans=n/8;
        if(ans>0)   return 2*(n%8)+8;
        else return n;
    }
}