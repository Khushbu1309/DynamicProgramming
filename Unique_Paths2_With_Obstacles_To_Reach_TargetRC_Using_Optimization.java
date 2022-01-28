package DynamicProgramming;

public class Unique_Paths2_With_Obstacles_To_Reach_TargetRC_Using_Optimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{0,0,0},{0,1,0},{0,0,0}};
		
		int paths= Find_Unique_Paths2_without_Using_Obstacles_Optimization( arr.length,arr[0].length,arr);
		
		System.out.println(paths);	
		
		


	}

	private static int Find_Unique_Paths2_without_Using_Obstacles_Optimization(int r, int c, int[][] arr) {
		int[]prev=new int[r];
		for(int i=0;i<r;i++) {
			int[]curr=new int[r];
			for(int j=0;j<c;j++) {
				if(arr[i][j]==1) {
					curr[j]=0;
				}
				else if(i==0 && j==0) {
					curr[j]=1;
				}
				else {
					int up=0;
					int left=0;
					if(i>0)
						 up=prev[j];
					if(j>0)
						 left=curr[j-1];
					curr[j]=up+left;
				}
				
			}
			prev=curr;
		}
		return prev[c-1];
		
	}

}
