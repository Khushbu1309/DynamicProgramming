package DynamicProgramming;

public class Minimum_Path_Sum_Using_Optimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]grid={{1,3,1},{1,5,1},{4,2,1}};
		int min_cost=Min_Cost_Path_Using_Optimization(grid);
		System.out.println(min_cost);
		

	}

	private static int Min_Cost_Path_Using_Optimization(int[][] grid) {
		int r=grid[0].length;
		int c=grid[0].length;
		int[] prev=new int[r];
		for(int i=0;i<r;i++) {
			int[] curr=new int[r];
			for(int j=0;j<c;j++) {
				if(i==0 && j==0) {
					curr[j]=grid[i][j];
				}
				else {
					int up=grid[i][j];
					if(i>0)
						up+=prev[i-1];
					else {
						up+=Math.pow(10, 9);
					}
					
					int left=grid[i][j];
					if(j>0) {
						left+=curr[j-1];
					}
					else {
						left+=Math.pow(10, 9);
					}
					curr[j]=Math.min(up, left);
				
				}
			
			}
			prev=curr;
		}
		
		return prev[c-1];
	}

}
