package DynamicProgramming;

public class Right_Angle_Triangle_Minimum_Cost_To_Reach_Last_Row_Using_Tabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=  {{1}, {2,3}, {3,6,7}, {8,9,6,1}};
		

		int Minimum_cost=Min_Cost_To_Reach_Last_Row_Using_Tabulation(arr,arr.length);
		System.out.println(Minimum_cost);


	}

	private static int Min_Cost_To_Reach_Last_Row_Using_Tabulation(int[][] arr, int n) {
		// TODO Auto-generated method stub
		int[][] dp=new int[n][n];
		for(int j=0;j<n;j++) {
			dp[arr.length-1][j]=arr[n-1][j];
		}
		
		for(int i=n-2;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				int down=arr[i][j]+dp[i+1][j];
				int diagonal=arr[i][j]+dp[i+1][j+1];
				dp[i][j]=Math.min(down, diagonal);
			}
		}
		return dp[0][0];
	}

}
