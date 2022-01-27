package DynamicProgramming;

public class Minimum_Path_Sum_Using_Memorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr={{1,3,1},{1,5,1},{4,2,1}};
		int[][] dp=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		int Min_Cost=Min_Cost_Path_Using_Memorization(arr.length-1,arr[0].length-1,arr,dp);
		System.out.println(Min_Cost);

	}

	private static int Min_Cost_Path_Using_Memorization(int i, int j, int[][] grid, int[][] dp) {
		if(i==0 && j==0) {
			return grid[i][j];
		}
		if(i<0 || j<0) {
			return (int)Math.pow(10,9);
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int up=grid[i][j]+Min_Cost_Path_Using_Memorization(i-1,j-1,grid,dp);
		int left=grid[i][j]+Min_Cost_Path_Using_Memorization(i,j-1,grid,dp);
		int min=Math.min(up, left);
		return dp[i][j]=min;
	}

}
