package ProblemSet_4;

import java.util.Arrays;

public class CommonElements {
	public String commonElements(int[]arr1,int[]arr2) {
		String commonelements="";
		String[]stringarr1=Arrays.toString(arr1).replace("[", "").replace("]","").split(", ");
		String[]stringarr2=Arrays.toString(arr2).replace("[", "").replace("]","").split(", ");
		if(arr2.length<arr1.length) {
			String string1=Arrays.toString(arr1).replace("[", "").replace("]","");
			for(int i=0;i<stringarr2.length;i++) {
				if(string1.contains(stringarr2[i])) {
					commonelements+=stringarr2[i]+" ";
				}
			}
		}else if(arr1.length<arr2.length) {
			String string2=Arrays.toString(arr2).replace("[", "").replace("]","");
			for(int i=0;i<stringarr1.length;i++) {
				if(string2.contains(stringarr1[i])) {
					commonelements+=stringarr1[i]+" ";
				}
			}
		}else {
			String string1=Arrays.toString(arr1).replace("[", "").replace("]","");
			for(int i=0;i<stringarr2.length;i++) {
				if(string1.contains(stringarr2[i])) {
					commonelements+=stringarr2[i]+" ";
				}
			}
		}
		return commonelements;
	}
	public static void main(String[]args) {
		int[]arr1= {1,9,4,6,8};
		int[]arr2= {2,10,15,8,6};
		String commonElements=new CommonElements().commonElements(arr1, arr2);
		System.out.println(commonElements);
	}

}
