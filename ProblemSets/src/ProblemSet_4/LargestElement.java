package ProblemSet_4;

public class LargestElement {
	public int getLargestElement(int[]arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[]args) {
		int[]arr= {1,9,5,3,22,98,8};
		int largestElement=new LargestElement().getLargestElement(arr);
		System.out.println("The Largest Element is "+largestElement);
	}

}
