package ProblemSet_4;

public class ArrayDescendingSort {
	public void bubbleSort(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayDescendingSort obj=new ArrayDescendingSort();
		int[]arr= {1,9,5,3,22,98,8};
		obj.bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
