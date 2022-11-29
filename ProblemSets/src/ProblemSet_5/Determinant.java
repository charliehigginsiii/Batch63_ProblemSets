package ProblemSet_5;


public class Determinant {
	public int findDeterminant(int[][]arr) {
		int determinant=arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0];
		return determinant;
	}
	public static void main(String[]args) {
		int[][]arr={{5,7},{3,15}};
		int determinant=new Determinant().findDeterminant(arr);
		System.out.println(determinant);
	}
}
