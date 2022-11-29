package ProblemSet_5;


public class BoundaryElements {
	public void printBoundryElements(int[][]arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==(arr.length-1)||i==0||j==(arr[0].length-1)||j==0) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		int[][]arr= {{1,6,9,11},{8,2,4,11},{24,7,10,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		new BoundaryElements().printBoundryElements(arr);
	}
}
