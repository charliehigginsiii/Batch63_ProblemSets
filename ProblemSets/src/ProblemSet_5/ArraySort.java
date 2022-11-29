package ProblemSet_5;

public class ArraySort {
	public void sortAcrossColumns(int[][]arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1-i;j++) {
				if(arr[i][j]>arr[i][j+1]) {
					int temp=arr[i][j];
					arr[i][j]=arr[i][j+1];
					arr[i][j+1]=temp;
				}
			}
		}
	}
	public static void main(String[]args) {
		ArraySort obj=new ArraySort();
		int[][]arr= {{5,7,2,3},{9,11,4,6}};
		obj.sortAcrossColumns(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
