package DynamicProgramming;

public class Minimum_Path_Sum_Using_Recursion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr={{1,3,1},{1,5,1},{4,2,1}};
		int Min_Cost=Min_Path_Using_Recursion(arr.length-1,arr[0].length-1,arr);
		System.out.println(Min_Cost);
		
		

	}

	private static int Min_Path_Using_Recursion(int i, int j, int[][] arr) {
		// TODO Auto-generated method stub
		if(i==0 && j==0) {
			return arr[i][j];
		}
		if(i<0 || j<0) {
			return (int)Math.pow(10, 9);
		}
		int up=arr[i][j] + Min_Path_Using_Recursion(i-1,j,arr);
		int left=arr[i][j] + Min_Path_Using_Recursion(i,j-1,arr);
		return Math.min(up, left);
		
		
	}

}
