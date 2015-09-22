
public class MinPathSum {

	public static void main(String args[]){
		int[][] grid = new int[2][3];
		int k=0;
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				grid[i][j] = k;
				k++;
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(grid[i][j]);
			}
			System.out.print('\n');
		}
		
		int minSum = MinPathSum(grid);
		System.out.print(minSum);
	}
	
	public static int MinPathSum (int[][] grid){
		int[] row = new int[grid[0].length];
		int a=grid.length;
		int b=grid[0].length;
		
		for(int i=0; i<grid.length;i++){
			for(int j=0; j<grid[0].length; j++){
				if(j>0)
					row[j] = i>0 ? Math.min(row[j-1], row[j]): row[j-1];
				row[j] += grid[i][j];
			}
		}
		return row[grid[0].length-1];
	}
}
