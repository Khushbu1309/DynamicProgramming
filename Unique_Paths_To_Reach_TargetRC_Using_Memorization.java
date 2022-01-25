package DynamicProgramming;

public class Unique_Paths_To_Reach_TargetRC_Using_Memorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		int col=3;
		int[][] dp=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				dp[i][j]=-1;
			}
		}
		int paths= Find_Unique_Paths_Using_Memoization(row-1,col-1,dp);
		System.out.println(paths);


	}

	private static int Find_Unique_Paths_Using_Memoization(int i, int j, int[][] dp) {
		if(i==0 && j==0) {
			return 1;
		}
		if(i<0 || j<0) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int top=Find_Unique_Paths_Using_Memoization(i-1,j,dp);
		int left=Find_Unique_Paths_Using_Memoization(i,j-1,dp);
		return dp[i][j]=top+left;
		
	}

}
