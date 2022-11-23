package ProblemSet_2;

import java.util.Arrays;

public class Problem5 {
	public String getLargestElement(int[]arr) {
		String thirdLargest="";
		if(arr.length<3) {
			return "The array has less than 3 elements";
		}else {
			Arrays.sort(arr);
			thirdLargest=Integer.toString(arr[arr.length-3]);
		}
		return thirdLargest;
	}
	public static void main(String []args) {
		int[]arr= {1,9,4,6};
		System.out.println(new Problem5().getLargestElement(arr));
	}
}
