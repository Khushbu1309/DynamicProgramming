package DynamicProgramming;

public class Maximum_Path_Sum_Obtained_Starting_Any_Cell_First_Row_To_Any_Cell_In_Last_Row_Recursion {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
		int maxi=(int) Integer.MIN_VALUE;
		for(int i=0;i<arr[0].length-1;i++) {
			int Path_Sum=Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Recursion(arr,arr.length-1,i);
			maxi=Math.max(maxi, Path_Sum);
			
			
		}
			System.out.println(maxi);
		
	}

	private static int Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Recursion(int[][] arr, int r, int c) {
		//if((c>=0 || c<arr[0].length))
		if( c<0 || c>=arr[0].length) {
			return Integer.MIN_VALUE;
		}
		if (r == 0 ) {
			return arr[0][c];
		}
		
		int Up=arr[r][c]+Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Recursion(arr,r-1,c);
		int Up_left_diagonal=arr[r][c]+Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Recursion(arr,r-1,c-1);
		int Up_right_diagonal=arr[r][c]+Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Recursion(arr,r-1, c+1);
		return Math.max(Up,Math.max(Up_right_diagonal, Up_left_diagonal));
	}

}
