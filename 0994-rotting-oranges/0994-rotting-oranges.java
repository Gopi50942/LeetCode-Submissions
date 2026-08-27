class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m =grid[0].length;
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> q= new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){return 0;}
        int time=0;
        while(!q.isEmpty() && fresh>0){
            int s=q.size();
            time++;
            for(int i=0;i<s;i++){
                int[] p=q.poll();
                int x=p[0];
                int y=p[1];
                for(int k=0;k<4;k++){
                    int nx=x+directions[k][0];
                    int ny=y+directions[k][1];
                    if(nx<0||ny<0||nx>=n||ny>=m||grid[nx][ny]==0){
                        continue;
                    }
                    if(grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        fresh--;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
        if(fresh==0){return time;}
        else{
            return -1;
        }
    }
}