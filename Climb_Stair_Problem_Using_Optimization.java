package DynamicProgramming;

import java.util.Scanner;

public class Climb_Stair_Problem_Using_Optimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int total_Ways_To_Nth_Stair=Number_Of_Ways_To_Reach_Nth_Stair_Using_Optimization(n);
		System.out.println(total_Ways_To_Nth_Stair);
		



	}

	private static int Number_Of_Ways_To_Reach_Nth_Stair_Using_Optimization(int n) {
		int prev=1;
		int sprev=1;
		for(int i=2;i<=n;i++) {
			int curr=prev+sprev;
			sprev=prev;
			prev=curr;
			
			
		}
		return prev;
	}

}
