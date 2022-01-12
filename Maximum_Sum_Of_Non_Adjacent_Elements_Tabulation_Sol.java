package DynamicProgramming;

import java.util.Arrays;

public class Maximum_Sum_Of_Non_Adjacent_Elements_Tabulation_Sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,1,4,9};
		
		int n=arr.length;
		int[] dp=new int[n];
		int MaxSum=Tabulation_Sol(arr,n,dp);
		System.out.println(MaxSum);



	}

	private static int Tabulation_Sol(int[] arr, int n, int[] dp) {
		// TODO Auto-generated method stub
		dp[0]=arr[0];
		for(int i=1;i<n;i++) {
			
			int pick=arr[i];
			if(i>1) {
				pick+=dp[i-2];
			}
			
			int notpick=0+dp[i-1];
			dp[i]=Math.max(pick, notpick);
			
		}
		return dp[n-1];
	}

}
