package ProblemSet_5;

public class ArrayPrint {
	public void printArray(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		int[][]arr= {{5,6,2,3},{9,11,4,7}};
		new ArrayPrint().printArray(arr);
	}

}
