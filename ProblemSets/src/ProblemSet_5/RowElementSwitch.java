package ProblemSet_5;


public class RowElementSwitch {
	public void switchElements(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(j==0) {
					int temp=arr[i][0];
					arr[i][0]=arr[i][arr[i].length-1];
					arr[i][arr[i].length-1]=temp;
				}
			}
		}
	}
	public static void main(String[]args) {
		int[][] arr= {{11,5},{8,4},{15,16}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		new RowElementSwitch().switchElements(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
