class Solution {
    public int findCircleNum(int[][] graph) {
        int n=graph.length,ans=0;
        boolean[] vis=new boolean[n+1];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                ans++;
                dfs(graph,i,vis);
            }
        }
        return ans;
    }
    public void dfs(int[][] g,int st, boolean[] vis){
        vis[st]=true;
        for(int i=0;i<g.length;i++){
            if(g[st][i]==1 && !vis[i]) dfs(g,i,vis);
        }
    }
}