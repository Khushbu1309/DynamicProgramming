package DynamicProgramming;

import java.util.Arrays;

public class Maximum_Sum_Of_Non_Adjacent_Elements_Memorization_Sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,1,4,9}/*{1, 2 ,3 ,1 ,3, 5, 8, 1, 9}*/;
		
		int n=arr.length;
		int[] dp=new int[n+1];
		Arrays.fill(dp, -1);
		int MaxSum=MemorizedSol(arr,n-1,dp);
		System.out.println(MaxSum);


	}

	private static int MemorizedSol(int[] arr, int ind, int[] dp) {
		if(ind==0) {
			return arr[0];
		}
		if(ind<0) {
			return 0;
		}
		if(dp[ind]!=-1) {
			return dp[ind];
		}
		
		int left=arr[ind]+ MemorizedSol(arr,ind-2,dp);
		int right=0+MemorizedSol(arr,ind-1,dp);
		return dp[ind]=Math.max(left,right);
		
		
	}

}
