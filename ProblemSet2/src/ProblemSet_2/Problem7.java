package ProblemSet_2;

import java.util.LinkedList;

public class Problem7 {
	public Boolean validParentheses(String s) {
		String boundarychars="";
		Boolean valid=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='('||s.charAt(i)==')'||s.charAt(i)=='{'||s.charAt(i)=='}'||s.charAt(i)=='['||s.charAt(i)==']') {
				boundarychars+=s.charAt(i);
			}
		}
		boundarychars=boundarychars.replaceAll(" ", "");
		//System.out.println(boundarychars);
		for(int i=0;i<boundarychars.length();i++) {
			for(int j=i+1;j<boundarychars.length();j++) {
				if(valid!=false) {
					if((boundarychars.charAt(i)=='('&&boundarychars.charAt(j)==']')||(boundarychars.charAt(i)=='['&&boundarychars.charAt(j)==')')||
							(boundarychars.charAt(i)=='('&&boundarychars.charAt(j)=='}')||(boundarychars.charAt(i)=='{'&&boundarychars.charAt(j)==')')||
							(boundarychars.charAt(i)=='['&&boundarychars.charAt(j)=='}')||(boundarychars.charAt(i)=='{'&&boundarychars.charAt(j)==']')||
							boundarychars.charAt(boundarychars.length()-1)=='('||boundarychars.charAt(0)==')'||
							boundarychars.charAt(boundarychars.length()-1)=='{'||boundarychars.charAt(0)=='}'||
							boundarychars.charAt(boundarychars.length()-1)=='['||boundarychars.charAt(0)==']'){
						valid=false;
						break;
					}else {
						valid=true;
						break;
					}
				}
			}
		}
		return valid;
	}
	public static void main(String[]args) {
		String s="(){[]}";
		boolean valid=new Problem7().validParentheses(s);
		if(valid) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
