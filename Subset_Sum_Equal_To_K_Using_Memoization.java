package DynamicProgramming;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Subset_Sum_Equal_To_K_Using_Memoization {

	public static void main(String[] args) {
		int n=4;
		int target=5;
		int[] arr= {4, 3, 2, 1};
		int[][] dp=new int[arr.length][target+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=target;j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(Is_Any_Subset_With_Sum_Equal_to_Target_Using_Memoization(n-1,target,arr,dp));
		

	}

	private static boolean Is_Any_Subset_With_Sum_Equal_to_Target_Using_Memoization(int index, int target, int[] arr, int[][] dp) {
		if(target==0) {
			return true;
		}
		if(index==0) {
			return (arr[index]==target);
		}
		if(dp[index][target]!=-1) {
			return dp[index][target]==0?false:true;
		}
		boolean Not_Take=Is_Any_Subset_With_Sum_Equal_to_Target_Using_Memoization(index-1,target,arr,dp);
		boolean Take=false;
		if(target>=arr[index]) 
			Take=Is_Any_Subset_With_Sum_Equal_to_Target_Using_Memoization(index-1,target-arr[index],arr,dp);
			dp[index][target]=Take||Not_Take?1:0;
		return Not_Take||Take;
		
	}

}
