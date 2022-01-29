package DynamicProgramming;

public class Right_Angle_Triangle_Minimum_Cost_To_Reach_Last_Row_Using_Recursion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=  {{1}, {2,3}, {3,6,7}, {8,9,6,1}};
		int Minimum_cost=Min_Cost_To_Reach_Last_Row_Uisng_Recursion(arr,0,0);
		System.out.println(Minimum_cost);

	}

	private static int Min_Cost_To_Reach_Last_Row_Uisng_Recursion(int[][] arr, int i, int j) {
		if(i==arr.length-1 ) {
			return arr[arr.length-1][j];
		}
		int down=arr[i][j]+Min_Cost_To_Reach_Last_Row_Uisng_Recursion(arr,i+1,j);
		int diagonal=arr[i][j]+Min_Cost_To_Reach_Last_Row_Uisng_Recursion(arr,i+1,j+1);
		return Math.min(down, diagonal);
		
		
	}

}
