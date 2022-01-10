package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class DpFibonacciUsingMemorization {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] dp=new int[n+1];
		Arrays.fill(dp, -1);
		int nthfibonaccinumber=nthfibonaccinumberFibonacciUsingMemorization(dp,n);
		System.out.println(n+"th fibonacci number is "+nthfibonaccinumber);
		
		

	}


	private static  int nthfibonaccinumberFibonacciUsingMemorization(int[] dp, int n) {
		if(n==1 || n==0) {
			return n;
		}
		int ans1,ans2;
		if(dp[n-1]==-1) {
			 ans1=nthfibonaccinumberFibonacciUsingMemorization(dp,n-1);
			 dp[n-1]=ans1;
		}
		else{
			ans1=dp[n-1];
		}
		if(dp[n-2]==-1) {
			 ans2=nthfibonaccinumberFibonacciUsingMemorization(dp,n-2);
			 dp[n-2]=ans2;
		}
		else{
			ans2=dp[n-2];
		}
		int nthans=ans1+ans2;
		return nthans;
	}

}
