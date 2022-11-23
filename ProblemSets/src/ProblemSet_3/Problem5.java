package ProblemSet_3;

public class Problem5 {
	public int[][] multiplyMatrices(int[][]arr1,int[][]arr2) {
		int[][]newarr=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				newarr[i][j]=arr1[i][j]*arr2[i][j];
			}
		}
		return newarr;	
	}
	public static void main(String[]args) {
		int[][]arr1= {{1,6,4},{9,5,6}};
		int[][]arr2= {{2,7,10},{6,3,8}};
		int[][]sumarray=new Problem5().multiplyMatrices(arr1, arr2);
		for(int i=0;i<sumarray.length;i++) {
			for(int j=0;j<sumarray[i].length;j++) {
				System.out.print(sumarray[i][j]+" ");
			}
			System.out.println();
		}
	}

}