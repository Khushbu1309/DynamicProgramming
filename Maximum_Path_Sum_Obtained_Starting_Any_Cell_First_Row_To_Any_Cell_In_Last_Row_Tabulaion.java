package DynamicProgramming;

public class Maximum_Path_Sum_Obtained_Starting_Any_Cell_First_Row_To_Any_Cell_In_Last_Row_Tabulaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] arr= {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
		int[][] arr={{10, 2 ,3},{3, 7, 2},{8, 1, 5}};
		int m=arr[0].length;
		int n=arr.length;
		int Path_Sum=Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Tabulation(arr,n,m);
		
			System.out.println(Path_Sum);
		


	}

	private static int Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Tabulation(int[][] arr, int n, int m) {
		int[][] prev=new int[n][m];
		for(int i=0;i<m;i++) {
			prev[0][i]=arr[0][i];
			//System.out.print(prev[0][i]+" ");
		}
		//System.out.println();
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				
				int up=(arr[i][j]+prev[i-1][j]);
				
				int diagonal_left=arr[i][j];
				if(j-1>=0) 
					diagonal_left+=prev[i-1][j-1];
				
				else 
					diagonal_left+=(int) -1e8;
				
				
				
				int diagonal_right=arr[i][j];
				if(j+1<arr[0].length) 
					diagonal_right+=prev[i-1][j+1];
				
				else
					diagonal_right+=(int) -1e8;
				
				
				
				
				
				prev[i][j]=Math.max( up,Math.max(diagonal_right,  diagonal_left));
					
			}
			//prev=curr;
		}
		int maxi=(int) -1e9;
		for(int i=0;i<m;i++) {
			//System.out.print(prev[arr[0].length-1][i]+" ");
			maxi=Math.max(maxi, prev[n-1][i]);
		}
		return maxi;
		
		
		
		
		
		
		
		
		
		
//		int n=arr.length;
//		int m=arr[0].length;
//		int[][]dp=new int[n][m];
//		for(int i=0;i<arr[0].length;i++) {
//			dp[0][i]=arr[0][i];
//			System.out.print(dp[0][i]+" ");
//		}
//		System.out.println();
//		for(int i=1;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				
//				
//				int diagonal_left=arr[i][j];
//				if(j-1>0) 
//					diagonal_left+=dp[i-1][j-1];
//				
//				else 
//					diagonal_left+=(int) -1e8;
//				
//				
//				
//				int diagonal_right=arr[i][j];
//				if(j+1<m) 
//					diagonal_right+=dp[i-1][j+1];
//				
//				else
//					diagonal_right+=(int) -1e8;
//				
//				int up=(arr[i][j]+dp[i-1][j]);
//				
//				
//				
//				int mx=Math.max( diagonal_left, diagonal_left);
//				dp[i][j]=Math.max(up, mx);
//				
//				System.out.print(dp[i][i]+"  ");
//				
//			}
//			System.out.println();
//		}
//		int maxi=(int) -1e8;
//		for(int i=0;i<m;i++) {
//			System.out.print(dp[n-1][i]+" ");
//			maxi=Math.max(maxi, dp[n-1][i]);
//		}
//		return maxi;
	}

}
