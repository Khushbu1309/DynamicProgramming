package DynamicProgramming;

import java.util.Scanner;

public class fibonacci {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int r=fib(n);
		System.out.println(r);

	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
	
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-2]+dp[i-1];
		}
		
		return dp[n];
	}

}
