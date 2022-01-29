package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Climb_Stair_Problem_Using_Tabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int total_Ways_To_Nth_Stair=Number_Of_Ways_To_Reach_Nth_Stair_Using_Tabulation(n);
		System.out.println(total_Ways_To_Nth_Stair);
		

	}

	private static int Number_Of_Ways_To_Reach_Nth_Stair_Using_Tabulation(int n) {
		int[] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
			
		}
		return dp[n];
		
	}

}
