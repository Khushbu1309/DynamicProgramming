package DynamicProgramming;

public class Subset_Sum_Equal_To_K_Using_Tabulation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int target=4;
		int[] arr= {2 ,5, 1, 6, 7};
		
		System.out.println(Is_Any_Subset_With_Sum_Equal_to_Target_Using_Tabulation(arr.length,target,arr));
		

	}

	private static boolean Is_Any_Subset_With_Sum_Equal_to_Target_Using_Tabulation(int n, int target, int[] arr) {
		boolean[][] dp=new boolean[n][target+1];
		for(int i=0;i<n;i++)
			dp[i][0]=true;
		
		if(arr[0]<=target) {
			dp[0][arr[0]]=true;
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=target;j++)
			{
				boolean notpick=dp[i-1][j];
				boolean take=false;
				if(arr[i]<=j) {
					take=dp[i-1][j-arr[i]];
				}
				dp[i][j]=take || notpick;
			}
		}
	
		return dp[n-1][target];
	}

	
}
