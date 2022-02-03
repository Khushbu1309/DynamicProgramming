package DynamicProgramming;

public class Maximum_Number_Of_Chocolates_Ninja_Collect_with_help_Of_His_Friend_Using_Memoization {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=3;
		int c=4;
		int[][] grid = {{2,3,1,2},{3,4,2,2},{5,6,3,5}};
		int[][][] dp=new int[3][4][4];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				for(int k=0;k<c;k++) {
					dp[i][j][k]=-1;
				}
		
			}
		}
		
		
		int Maximum_Choclates=Ninja_And_His_Friends_Using_Memoization(0,0,c-1,r,c,grid,dp);
		System.out.println(Maximum_Choclates);


	}

	private static int Ninja_And_His_Friends_Using_Memoization(int i, int j1, int j2, int r, int c, int[][] arr, int[][][] dp) {
	
		if(j1<0 || j2<0 || j1>=c || j2>=c) {
			return (int) -1e8;
		}
		if(dp[i][j1][j2]!=-1) {
			return dp[i][j1][j2];
		}
		if(i==r-1) {
			if(j1==j2) 
				return arr[i][j1];
			else
				return arr[i][j1]+arr[i][j2];
		}
		int maxi=(int) -1e8;
		for(int dj1=(-1);dj1<=(+1);dj1++) {
			for(int dj2=(-1);dj2<=(+1);dj2++) {
				int value=0;
				if(j1==j2)
					value=arr[i][j1];
				else
					value=arr[i][j1]+arr[i][j2];
				value+=Ninja_And_His_Friends_Using_Memoization(i+1,j1+dj1,j2+dj2,r,c,arr, dp);
				maxi=Math.max(maxi, value);
			}
		}
		return dp[i][j1][j2]= maxi;

	}

}
