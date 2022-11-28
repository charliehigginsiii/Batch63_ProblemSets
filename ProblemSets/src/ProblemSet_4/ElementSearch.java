package ProblemSet_4;

public class ElementSearch {
	public int findElement(int[]arr, int targetelement) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==targetelement) {
				index=i;
			}
		}
		return index;
	}
	public static void main(String[]args) {
		int[]arr= {1,9,5,3,22,98,8};
		int indexOfElement=new ElementSearch().findElement(arr, 7);
		if(indexOfElement>=0) {
			System.out.println("The Element can be found at index "+indexOfElement);
		}else {
			System.out.println("Element can not be found");
		}
		
	}

}
