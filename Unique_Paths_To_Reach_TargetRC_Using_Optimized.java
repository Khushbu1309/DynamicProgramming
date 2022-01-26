package DynamicProgramming;

public class Unique_Paths_To_Reach_TargetRC_Using_Optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		int col=3;
		int[] prev=new int[col];
		
		for(int i=0;i<row;i++) {
			int[] curr=new int[col];
			for(int j=0;j<col;j++){
				if(i==0 && j==0) {
					curr[j]=1;
				}
				else {
					int up=0;
					
					int left=0;
					if(i>0) {
						up=prev[j];
						
					}
					if(j>0) {
						left=curr[j-1];
						
					}
					curr[j]=up+left;
				}
				
			}
			prev=curr;
		}
		System.out.println(prev[col-1]);
	}
}
		
		//int paths= Find_Unique_Paths_Using_Optimization(row-1,col-1);
		
		//	
		

	//}

//	private static int Find_Unique_Paths_Using_Optimization(int i, int j) {
//		
//		return 0;
//		
//		
//	}

//}
