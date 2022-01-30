package DynamicProgramming;

public class Right_Angle_Triangle_Minimum_Cost_To_Reach_Last_Row_Using_Optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=  {{1}, {2,3}, {3,6,7}, {8,9,6,1}};
		

		int Minimum_cost=Min_Cost_To_Reach_Last_Row_Using_Optimization(arr,arr.length);
		System.out.println(Minimum_cost);


	}

	private static int Min_Cost_To_Reach_Last_Row_Using_Optimization(int[][] arr, int n) {
		int[] front=new int[n];
		for(int i=0;i<n;i++) {
			front[i]=arr[n-1][i];
		}
		for(int i=n-2;i>=0;i--) {
			int[] curr=new int[n];
			for(int j=i;j>=0;j--) {
				int down=arr[i][j]+front[j];
				int diagonal=arr[i][j]+front[j+1];
				curr[j]=Math.min(down, diagonal);
				
			}
			front=curr;
			
		}
		return front[0];
	}

}
