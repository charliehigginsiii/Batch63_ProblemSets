package ProblemSet_8;

import java.util.ArrayList;
import java.util.Arrays;

public class BooleanValues {
	public boolean checkBooleanValues(boolean b1,boolean b2, boolean b3) {
		ArrayList<Boolean> booleanlist=new ArrayList<>(Arrays.asList(b1,b2,b3));
		int count=0;
		boolean twoTrue=false;
		for(int i=0;i<booleanlist.size();i++) {
			if(booleanlist.get(i)==true) {
				count+=1;
			}
		}
		if(count>=2) {
			twoTrue=true;
		}
		return twoTrue;
	}
	public static void main(String[]args) {
		boolean b1=true;
		boolean b2=false;
		boolean b3=false;
		System.out.println(new BooleanValues().checkBooleanValues(b1, b2, b3));
		
		
	}

}
