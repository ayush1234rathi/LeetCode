class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0, i = 0, j = 0, l = s.length();
        int[] abc = new int[3];
        while (j < l) {
            abc[s.charAt(j) - 'a']++;
            // if(abc[0]>0 && abc[1]>0 && abc[2]>0){ 
            //     ans+=(l-j);
            while (abc[0] > 0 && abc[1] > 0 && abc[2] > 0) {
                ans += (l - j);
                abc[s.charAt(i++) - 'a']--;
            }
            // }
            j++;
        }
        return ans;
    }
}