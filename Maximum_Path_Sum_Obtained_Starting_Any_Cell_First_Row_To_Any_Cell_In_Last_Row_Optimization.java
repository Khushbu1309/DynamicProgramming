package DynamicProgramming;

public class Maximum_Path_Sum_Obtained_Starting_Any_Cell_First_Row_To_Any_Cell_In_Last_Row_Optimization {

	public static void main(String[] args) {
		int[][] arr= {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
		int m=arr[0].length;
		int n=arr.length;
		int Path_Sum=Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Optimization(arr,n,m);
		
		System.out.println(Path_Sum);
		



	}

	private static int Maximum_Path_Sum_Obtained_First_Row_To_Last_Any_Cell_Optimization(int[][] arr, int n, int m) {
		int[] prev=new int[m];
		for(int i=0;i<m;i++) {
			prev[i]=arr[0][i];
			System.out.print(prev[i]+" ");
		}
		
		System.out.println();
		for(int i=1;i<n;i++) {
			int[] curr=new int[m];
			for(int j=0;j<m;j++) {
				
				int up=(arr[i][j]+prev[j]);
				
				int diagonal_left=arr[i][j];
				if(j-1>=0) 
					diagonal_left+=prev[j-1];
				
				else 
					diagonal_left+= -1e8;
				
				
				
				int diagonal_right=arr[i][j];
				if(j+1<=m-1) 
					diagonal_right+=prev[j+1];
				
				else
					diagonal_right+=-1e8;
				
				
				
				
				
				curr[j]=Math.max( up,Math.max(diagonal_right,  diagonal_left));
					
			}
			prev=curr;
		}
		int maxi=(int) -1e9;
		for(int i=0;i<m;i++) {
			//System.out.print(prev[arr[0].length-1][i]+" ");
			maxi=Math.max(maxi, prev[i]);
		}
		return maxi;
		

	}

}
