package DynamicProgramming;

public class Maximum_Path_Sum_Obtained_Starting_Any_Cell_First_Row_To_Any_Cell_In_Last_Row_Memoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
		int[][] dp=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		int maxi=(int) -1e8;
		for(int i=arr[0].length-1;i>=0;i--) {
			int Path_Sum=Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Memoization(arr,arr.length-1,i,dp);
			maxi=Math.max(maxi, Path_Sum);
			
			
		}
			System.out.println(maxi);
		

	}

	private static int Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Memoization(int[][] arr, int r, int c, int[][] dp) {
		if( c<0 || c>=arr[0].length) {
			return (int) -1e8;
		}
		if (r == 0 ) {
			return arr[0][c];
		}
		if(dp[r][c]!=-1) {
			return dp[r][c];
		}
		
		int Up=arr[r][c]+Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Memoization(arr,r-1,c,dp);
		int Up_left_diagonal=arr[r][c]+Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Memoization(arr,r-1,c-1,dp);
		int Up_right_diagonal=arr[r][c]+Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Memoization(arr,r-1, c+1,dp);
		return dp[r][c]= Math.max(Up,Math.max(Up_right_diagonal, Up_left_diagonal));
	}

}
