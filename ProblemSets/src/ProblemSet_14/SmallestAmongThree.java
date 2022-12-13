package ProblemSet_14;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestAmongThree {
	public int getSmallest(int n1,int n2, int n3) {
		ArrayList<Integer> numlist=new ArrayList<>(Arrays.asList(n1,n2,n3));
		int min=numlist.get(0);
		for(int i=0;i<numlist.size();i++) {
			if(min>numlist.get(i)) {
				min=numlist.get(i);
			}
		}
		return min;
		
	}
	public static void main(String[]args) {
		int n1=5;
		int n2=10;
		int n3=12;
		System.out.println("Minimum Number: "+new SmallestAmongThree().getSmallest(n1, n2, n3));
	}

}
