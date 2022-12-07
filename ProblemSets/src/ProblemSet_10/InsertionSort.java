package ProblemSet_10;

public class InsertionSort {
		public void insertionSort(int[]arr) {
			for(int i=0;i<arr.length-1;i++) {
				int key=arr[i];
				int j=i-1;
				while(j>=0&&(arr[j]>key)) {
						arr[j+1]=arr[j];
						j--;
					}
				arr[j+1]=key;
				
			}
		}
		public static void main(String[]args) {
			int[]arr= {1,9,5,6,12};
			new InsertionSort().insertionSort(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}


}
