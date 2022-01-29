package DynamicProgramming;

import java.util.Scanner;

public class Climb_Stair_Problem_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int ways=Number_Of_Ways_To_Reach_Nth_Stair_Using_Recursion(N);
		System.out.println(ways);
	}
	static int count=0;
	private static int Number_Of_Ways_To_Reach_Nth_Stair_Using_Recursion(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return 0;
		}
		int left=Number_Of_Ways_To_Reach_Nth_Stair_Using_Recursion(n-1);
		int right=Number_Of_Ways_To_Reach_Nth_Stair_Using_Recursion(n-2);
		return left+right;
		
	}

}
