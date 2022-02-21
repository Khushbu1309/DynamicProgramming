package DynamicProgramming;

public class Subset_Sum_Equal_To_K_Using_Optimization {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int target=4;
		int[] arr= {2 ,5, 1, 6, 7};
		
		System.out.println(Is_Any_Subset_With_Sum_Equal_to_Target_Using_Optimization(arr.length,target,arr));
		

	}

	private static boolean Is_Any_Subset_With_Sum_Equal_to_Target_Using_Optimization(int n, int k, int[] arr) {
		 boolean[]prev=new boolean[k+1];
	        
	        prev[0]=true;
	       
	        if(arr[0]<=k){
	             prev[arr[0]]=true;
	        }
	   
	        for(int i=1;i<n;i++){
	            boolean[]curr=new boolean[k+1];
	        	curr[0]=true;
	            for(int target=1;target<=k;target++){
	                 boolean notpick=prev[target];
	                 boolean pick=false;
	                 if(arr[i]<=target){
	                    pick=prev[target-arr[i]];
	                 }
	                curr[target]=pick || notpick;

	            }
	            prev=curr;
	        }
	        return prev[k];
	        
	}

}
