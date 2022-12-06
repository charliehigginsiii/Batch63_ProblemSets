package ProblemSet_9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PositionofLastOccurance {
	public int getPositionOfLastOccurance(List<Integer> list, int element){
		List<Integer> occurances=new LinkedList<>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==element) {
				occurances.add(list.get(i));
			}
		}
		return occurances.size()-1;
	}
	public static void main(String[]args) {
		PositionofLastOccurance getter=new PositionofLastOccurance();
		List<Integer> list=new LinkedList<>();
		list.addAll(Arrays.asList(5,9,11,4,6,5,7,8));
		System.out.println(getter.getPositionOfLastOccurance(list, 5));
	}

}
