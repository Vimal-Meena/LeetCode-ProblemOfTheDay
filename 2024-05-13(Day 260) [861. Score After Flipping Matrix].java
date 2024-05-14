// #LeetCode:861

class Solution {
    public static int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            if(grid[i][0]==0){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==0){
                        grid[i][j]=1;
                    } else{
                        grid[i][j] = 0;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
        // if(grid[i][0]==0){
            int count=0;
                for(int j=0;j<m;j++){
                    
                    if(grid[j][i]==0){
                        count++;
                    }
                }
                if(count>grid.length/2){
                    for(int j=0;j<m;j++){
                        if(grid[j][i]==0){
                            grid[j][i]=1;
                        } else{
                            grid[j][i] = 0;
                        }
                    }
                }
            
        }
       int ans = 0; 
        for(int i=0;i<m;i++){
            
            int pow = n-1;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    ans += Math.pow(2,pow);
                }
                pow--;
                
            }
            
        }

        return ans;
    }
}