package ProblemSet_5;


public class Transpose {
	public int[][] findTranspose(int[][]arr) {
	int[][]theTranspose=new int[3][3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			theTranspose[i][j]=arr[j][i];
		}
	}
	return theTranspose;
	
}
public static void main(String[]args) {
	int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] Transpose=new Transpose().findTranspose(arr1);
	System.out.println("Original Array: ");
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Transpose: ");
	for(int i=0;i<Transpose.length;i++) {
		for(int j=0;j<Transpose[i].length;j++) {
			System.out.print(Transpose[i][j]+" ");
		}
		System.out.println();
	}
}

}
