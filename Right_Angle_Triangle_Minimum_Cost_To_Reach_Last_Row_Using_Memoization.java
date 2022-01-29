package DynamicProgramming;

import java.util.Arrays;

public class Right_Angle_Triangle_Minimum_Cost_To_Reach_Last_Row_Using_Memoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=  {{1}, {2,3}, {3,6,7}, {8,9,6,1}};
		int[][] dp=new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				dp[i][j]=-1;
			}
		}
		
		int Minimum_cost=Min_Cost_To_Reach_Last_Row_Using_Memoization(0,0,arr,arr.length,dp);
		System.out.println(Minimum_cost);


	}

	private static int Min_Cost_To_Reach_Last_Row_Using_Memoization(int i, int j, int[][] arr, int n, int[][] dp) {
		if(i==n-1) {
			return arr[n-1][j];
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		
		int down=arr[i][j]+Min_Cost_To_Reach_Last_Row_Using_Memoization(i+1,j,arr,n,dp);
		int diagonal=arr[i][j]+Min_Cost_To_Reach_Last_Row_Using_Memoization(i+1,j+1,arr,n,dp);
		return dp[i][j]=Math.min(down, diagonal);
		
	}

	

}
