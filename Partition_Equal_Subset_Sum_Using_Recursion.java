package DynamicProgramming;

public class Partition_Equal_Subset_Sum_Using_Recursion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,2,11,4,1};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if(sum%2==1) {
			System.out.println("false");
		}
		else {
			int n=arr.length-1;
			int target=sum/2;
			boolean res=Is_Possible_To_Partition_Equal_Subset_Sum_Using_Recursion(arr,n,target);
			System.out.println(res);
		}
		
	}

	private static boolean Is_Possible_To_Partition_Equal_Subset_Sum_Using_Recursion(int[] arr, int n, int target) {
		if(target==0) {
			return true;
		}
		if(n==0) {
			return arr[n]==target; 
		}
		boolean notpick=Is_Possible_To_Partition_Equal_Subset_Sum_Using_Recursion(arr,n-1,target);
		boolean pick=false;
		pick=Is_Possible_To_Partition_Equal_Subset_Sum_Using_Recursion(arr,n-1,target-arr[n]);
		return pick || notpick;
	}

}
