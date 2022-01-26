package DynamicProgramming;

public class Unique_Paths2_With_Obstacles_To_Reach_TargetRC_Using_Memorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{0,0,0},{0,1,0},{0,0,0}};
		int[][] dp=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		
		int paths= Find_Unique_Paths2_without_Using_Obstacles( arr.length-1,arr[0].length-1,arr,dp);
		
		System.out.println(paths);	
		

	}

	private static int Find_Unique_Paths2_without_Using_Obstacles(int i, int j, int[][] arr, int[][] dp) {
		if(i>=0 && j>=0 && arr[i][j]==1) {
			return 0;
		}
		if(i==0 && j==0) {
			return 1;
		}
		if(i<0 || j<0) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int up=Find_Unique_Paths2_without_Using_Obstacles(i-1,j,arr,dp);
		int left=Find_Unique_Paths2_without_Using_Obstacles(i,j-1,arr,dp);
		return dp[i][j]= up+left;
	}

}
