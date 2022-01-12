package DynamicProgramming;

import java.util.Scanner;

public class Maximum_Sum_Of_Non_Adjacent_Elements_Recursive_Sol {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		//int n=scn.nextInt();
		int[] arr={1, 2 ,3 ,1 ,3, 5, 8, 1, 9};
		int n=arr.length;
		int MaxSum=RecursiveSol(arr,n-1);
		System.out.println(MaxSum);

	}

	private static int RecursiveSol(int[] arr, int n) {
		if(n==0) {
			return arr[0];
		}
		if(n<0) {
			return 0;
		}
		int pick=arr[n]+RecursiveSol(arr,n-2);
		int notpick=0+RecursiveSol(arr,n-1);
		return Math.max(pick, notpick);
		
		
	}

}
