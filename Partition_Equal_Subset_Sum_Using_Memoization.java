package DynamicProgramming;

import java.util.Arrays;

public class Partition_Equal_Subset_Sum_Using_Memoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3 ,1, 1, 2 ,2, 1};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if(sum%2==1) {
			System.out.println("false");
		}
		else {
			int n=arr.length;
			int target=sum/2;
			int[][]dp=new int[n][target+1];
			for(int[] i:dp) {
				Arrays.fill(i, -1);
			}
			
			
			boolean res=Is_Possible_To_Partition_Equal_Subset_Sum_Using_Memoization(arr,n-1,target,dp);
			System.out.println(res);
		}

	}

	private static boolean Is_Possible_To_Partition_Equal_Subset_Sum_Using_Memoization(int[] arr, int n, int target,
			int[][] dp) {
		
		if(target==0) {
			return true;
		}
		if(n==0) {
			return arr[n]==target; 
		}
		if(dp[n][target]!=-1) {
			return dp[n][target]==0?false:true;
		}
		boolean notpick=Is_Possible_To_Partition_Equal_Subset_Sum_Using_Memoization(arr,n-1,target,dp);
		boolean pick=false;
		if(arr[n]<=target) {
			pick=Is_Possible_To_Partition_Equal_Subset_Sum_Using_Memoization(arr,n-1,target-arr[n],dp);
			
		}
	
		 dp[n][target]=pick || notpick?1:0;
		 return pick || notpick;
	}

}
