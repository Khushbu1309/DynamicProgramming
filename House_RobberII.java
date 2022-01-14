package DynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class House_RobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int[] nums={1,2,3,1};
		int n=nums.length;
		
		ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0){
                al1.add(nums[i]);
            }
            if(i!=nums.length-1){
                 al2.add(nums[i]);  
            }
        }
         Object[] arr1 = al1.toArray();
         Object[] arr2 = al2.toArray();
        int res= Math.max(SpaceOptimizedSol(arr1,arr1.length),SpaceOptimizedSol(arr2,arr2.length));
        System.out.println(res);

	}
	  public static int SpaceOptimizedSol(Object[] arr2, int n) {
			// TODO Auto-generated method stub
			int prev=(int) arr2[0];
			int prev2=0;
			for(int i=1;i<n;i++) {
				int pick=(int) arr2[i];
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
