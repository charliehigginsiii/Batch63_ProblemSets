package ProblemSet_10;

import java.util.ArrayList;
import java.util.Random;

public class BogoSort {
	public void bogoSort(int[]arr) {
		ArrayList<String> booleanList=new ArrayList<>();
		booleanList.add("start");
		while(booleanList.toString().contains("false")||booleanList.toString().contains("start")) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[i]) {
						int randomnum=new Random().nextInt(0,arr.length-1);
						int temp=arr[randomnum];
						arr[randomnum]=arr[i];
						arr[i]=temp;
						booleanList.clear();
						booleanList.add("false");
					}else {
						if(booleanList.size()>0) {
							booleanList.remove(booleanList.size()-1);
						}
					}
				}
			}
		}
	}
	public static void main(String[]args) {
		int[]arr= {1,53,9,20,5,90,6,12,7,120,56,2,43,67};
		new BogoSort().bogoSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
