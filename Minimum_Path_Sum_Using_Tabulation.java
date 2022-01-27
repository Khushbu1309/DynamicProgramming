package DynamicProgramming;

public class Minimum_Path_Sum_Using_Tabulation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]grid={{1,3,1},{1,5,1},{4,2,1}};
		int min_cost=Min_Cost_Path_Using_Tabulation(grid);
		System.out.println(min_cost);
		

	}
	public static int Min_Cost_Path_Using_Tabulation(int[][] grid) {
		int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                }
                else{
                    int up=grid[i][j];
                    if(i>0)
                        up+=dp[i-1][j];
                    else
                        up+=Math.pow(10,9);
                    
                    
                    int left=grid[i][j];
                    if(j>0){
                        left+=dp[i][j-1];
                    }
                    else{
                        left+=Math.pow(10,9);
                    }
                    dp[i][j]=Math.min(left,up);
                }
            }
        }
       return dp[n-1][m-1];

	}

}
