package ProblemSet_10;

public class SelectionSort {
	public void selectionSort(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minelement=i;
			for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[minelement]) {
						minelement=j;
					}
			}
			int temp=arr[minelement];
			arr[minelement]=arr[i];
			arr[i]=temp;
			
		}
	}
	public static void main(String[]args) {
		int[]arr= {1,9,5,6,12};
		new SelectionSort().selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
