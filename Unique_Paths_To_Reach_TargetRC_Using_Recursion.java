package DynamicProgramming;

/*There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
*/
public class Unique_Paths_To_Reach_TargetRC_Using_Recursion    {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=3;
		int col=3;
		int paths= Find_Unique_Paths_Using_Recursion(row-1,col-1);
		System.out.println(paths);

	}


	private static int Find_Unique_Paths_Using_Recursion(int i, int j) {
		if(i==0 && j==0) {
			return 1;
		}
		if(i<0 || j<0) {
			return 0;
		}
		int up=Find_Unique_Paths_Using_Recursion(i-1,j);
		int left=Find_Unique_Paths_Using_Recursion(i,j-1);
		return up+left;
	}

}
