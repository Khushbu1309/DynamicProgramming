package DynamicProgramming;

public class Unique_Paths_To_Reach_TargetRC_Using_Tabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		int col=3;
		int[][] dp=new int[row][col];
		int paths= Find_Unique_Paths_Using_Tabulation(row-1,col-1,dp);
		
		System.out.println( paths);	
		
		//System.out.println(paths);


	}

	private static int Find_Unique_Paths_Using_Tabulation(int r, int c, int[][] dp) {
		dp[0][0]=1;
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i==0 && j==0 ) {
					continue;
					
				}
				else {
					int up=0;
					int left=0;
					if(i>0) {
						 up=dp[i-1][j];
					}
					if(j>0) {
						 left=dp[i][j-1];
					}
					
					dp[i][j]=up+left;
					
				}
				
				
			}
		}
		
		return dp[r][c];
		
	}

}
