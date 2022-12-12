package ProblemSet_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestofThree {
	public int findGreatest(int n1,int n2, int n3) {
		List<Integer> integerlist=new ArrayList<>(Arrays.asList(n1,n2,n3));
		int max=0;
		for(int i=0;i<integerlist.size();i++) {
			if(integerlist.get(i)>max) {
				max=integerlist.get(i);
			}
		}
		return max;
	}
	public static void main(String[]args) {
		int n1=5;
		int n2=2;
		int n3=4;
		System.out.println("Greatest Integer: "+new GreatestofThree().findGreatest(n1, n2, n3));
	}

}
