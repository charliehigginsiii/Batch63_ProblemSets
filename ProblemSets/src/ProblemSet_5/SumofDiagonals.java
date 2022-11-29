package ProblemSet_5;

public class SumofDiagonals {
	public int sumOfDiagonal(int[][]arr) {
		int sumofdiagonal=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					sumofdiagonal+=arr[i][j];
				}
			}
		}
		return sumofdiagonal;
	}
	public static void main(String[]args) {
		int[][] arr= {{10,5,6,15},{8,4,2,1},{14,16,7,9},{19,12,3,13}};
		int sumofdiagonal=new SumofDiagonals().sumOfDiagonal(arr);
		System.out.println("The sum of the diagonal is "+sumofdiagonal);
	}
}
