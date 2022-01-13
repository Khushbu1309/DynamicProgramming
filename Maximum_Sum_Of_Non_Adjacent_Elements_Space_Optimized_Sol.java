package DynamicProgramming;

import java.util.Scanner;

public class Maximum_Sum_Of_Non_Adjacent_Elements_Space_Optimized_Sol {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int[] arr={2,1,4,9};
		int n=arr.length;
		int MaxSum=SpaceOptimizedSol(arr,n);
		System.out.println(MaxSum);


	}

	@SuppressWarnings("unused")
	private static int SpaceOptimizedSol(int[] arr, int n) {
		// TODO Auto-generated method stub
		int prev=arr[0];
		int prev2=0;
		for(int i=1;i<n;i++) {
			int pick=arr[i];
			if(i>1) {
				pick+=prev2;
			}
			int notpick=prev;
			int curri=Math.max(pick, notpick);
			prev2=prev;
			prev=curri;
			
		}
		return prev;
	}

}
