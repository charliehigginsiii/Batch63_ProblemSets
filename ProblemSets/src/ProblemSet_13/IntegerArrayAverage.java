package ProblemSet_13;

public class IntegerArrayAverage {
	public double findArrayAverage(int[]arr) {
		double sum=0.0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum/(double)arr.length;
	}
	public static void main(String[]args) {
		int[]arr= {5,9,1,4,13,24,11};
		System.out.println("Average: "+new IntegerArrayAverage().findArrayAverage(arr));
	}

}
