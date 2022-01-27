package DynamicProgramming;

public class Unique_Paths2_With_Obstacles_To_Reach_TargetRC_Using_Tabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{0,1},{0,0}};
	
		int paths= Find_Unique_Paths2_without_Using_Obstacles_Tabulation( arr.length,arr[0].length,arr);
		
		System.out.println(paths);	
		
		

	}

	private static int Find_Unique_Paths2_without_Using_Obstacles_Tabulation(int r, int c, int[][] arr) {
		int[][] dp=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==1) {
					dp[i][j]=0;
				}
				else if(i==0 && j==0) {
					 dp[i][j]=1;
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
					dp[i][j]=(up+left);
				}
			}
		}
		return dp[r-1][c-1];
	}
}
