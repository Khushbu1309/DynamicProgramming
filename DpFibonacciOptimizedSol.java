package DynamicProgramming;

import java.util.Scanner;

public class DpFibonacciOptimizedSol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int res=FibonacciNthItem(n);
		System.out.println(res);
		

	}

	private static int FibonacciNthItem(int n) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3 = 0;
		n=n-1;
		while(n!=0){
			 n3=n1+n2;
			n1=n2;
			n2=n3;
			n--;
			
		}
		return n3;
	}

}
