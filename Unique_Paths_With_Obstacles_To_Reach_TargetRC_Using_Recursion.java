package DynamicProgramming;

public class Unique_Paths_With_Obstacles_To_Reach_TargetRC_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{0,0,0},{0,1,0},{0,0,0}};
	
		int paths= Find_Unique_Paths_without_Using_Obstacles( arr.length-1,arr[0].length-1,arr);
		
		System.out.println(paths);	
		

	}

	private static int Find_Unique_Paths_without_Using_Obstacles(int i, int j, int[][] arr) {
		// TODO Auto-generated method stub
		if(i>=0 && j>=0 && arr[i][j]==1 ) {
			return 0;
		}
		if(i==0 && j==0) {
			return 1;
		}
		if(i<0 || j<0) {
			return 0;
		}
		int up=Find_Unique_Paths_without_Using_Obstacles(i-1,j,arr);
		int left=Find_Unique_Paths_without_Using_Obstacles(i,j-1,arr);
		return up+left;
		
	}

	

}
