package ProblemSet_4;

public class OccuranceRemover {
	public int findNumberOfOccurances(int[] arr, int element) {
		int elementcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				elementcount++;
			}
		}
		return elementcount;
	}
	public int[] removeOccurance(int[]arr,int removeelement) {
		int[]newarr=new int[arr.length-findNumberOfOccurances(arr,removeelement)];
		int newlength=0;
		int newarrindex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=removeelement) {
				newarr[newarrindex]=arr[i];
				newarrindex++;
			}
		}
		return newarr;
	}
	public static void main(String[]args) {
		int[]arr= {1,9,5,3,7,5,8};
		arr=new OccuranceRemover().removeOccurance(arr, 5);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
