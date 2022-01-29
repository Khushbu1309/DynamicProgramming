package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Climb_Stair_Problem_Using_Memoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] dp=new int[n+1];
		Arrays.fill(dp, -1);
		int total_Ways_To_Nth_Stair=Number_Of_Ways_To_Reach_Nth_Stair_Using_Memoization(n,dp);
		System.out.println(total_Ways_To_Nth_Stair);
		

	}

	private static int Number_Of_Ways_To_Reach_Nth_Stair_Using_Memoization(int n, int[] dp) {
		if(n<0) {
			return 0;
		}

		 if(n==0) {
			return 1;
		}
		 if(dp[n]!=-1) {
			 return dp[n];
		 }
		
		int one_jump=Number_Of_Ways_To_Reach_Nth_Stair_Using_Memoization(n-1,dp);
		int two_jumps=Number_Of_Ways_To_Reach_Nth_Stair_Using_Memoization(n-2,dp);
		
		return dp[n]=one_jump+two_jumps;

		
		
	}

}
