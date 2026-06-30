class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] last = new int[]{-1,-1,-1};
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
            count=count+1+Math.min(last[0],Math.min(last[1],last[2]));
        }
        
        return count;
    }
}