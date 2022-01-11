package DynamicProgramming;

import java.util.Scanner;

public class StairProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int ways=NumberOfWaysToReachNthStair(N);
		System.out.println(ways);
	}
	static int count=0;
	private static int NumberOfWaysToReachNthStair(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return 0;
		}
		int left=NumberOfWaysToReachNthStair(n-1);
		int right=NumberOfWaysToReachNthStair(n-2);
		return left+right;
		
	}

}
