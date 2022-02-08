package DynamicProgramming;

public class Subset_Sum_Equal_To_K_Using_Recursion {

	
	public static void main(String[] args) {
		int n=4;
		int target=5;
		int[] arr= {4, 3, 2, 1};
		System.out.println(Is_Any_Subset_With_Sum_Equal_to_Target_Using_Recursion(n-1,target,arr));
		
	}

	private static boolean Is_Any_Subset_With_Sum_Equal_to_Target_Using_Recursion(int index, int target, int[] arr) {
		if(target==0) {
			return true;
		}
		if(index==0) {
			return (arr[index]==target);
		}
		boolean Not_Take=Is_Any_Subset_With_Sum_Equal_to_Target_Using_Recursion(index-1,target,arr);
		boolean Take=false;
		if(target>=arr[index]) {
			Take=Is_Any_Subset_With_Sum_Equal_to_Target_Using_Recursion(index-1,target-arr[index],arr);
		}
		return Take||Not_Take;
		
	}

}
