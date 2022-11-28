package ProblemSet_4;

import java.util.Arrays;

public class DuplicateRemover {
	public int[] removeDuplicates(int[]arr) {
		String arraystring="";
		for(int i=0;i<arr.length;i++) {
			if(!arraystring.contains(arr[i]+"")) {
				arraystring+=arr[i]+" ";
			}
		}
		String[] stringarr=arraystring.split(" ");
		int[] newarr=new int[stringarr.length];
		for(int i=0;i<stringarr.length;i++) {
			newarr[i]=Integer.parseInt(stringarr[i]);
		}
		return newarr;
	}
	public static void main(String[]args) {
		int[]arr= {1,9,5,3,8,5,10,15};
		arr=new DuplicateRemover().removeDuplicates(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
