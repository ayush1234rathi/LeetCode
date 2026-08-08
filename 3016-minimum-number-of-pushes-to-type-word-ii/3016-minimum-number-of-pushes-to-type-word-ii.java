class Solution {
    static class Pair{
        char c;
        int ct;
        Pair(char c, int ct){
            this.c=c;
            this.ct=ct;
        }
    }
    public int minimumPushes(String w) {
        int[] freq=new int[26];
        for(char c:w.toCharArray()) freq[c-'a']++;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.ct-a.ct);
        for(int i=0;i<26;i++){
            pq.add(new Pair((char)('a'+i),freq[i]));
        }
        int ans=0,idx=0;
        while(!pq.isEmpty()){
            ans=ans+((idx/8+1)*pq.poll().ct);
            idx++;
        }
        return ans;
    }
}