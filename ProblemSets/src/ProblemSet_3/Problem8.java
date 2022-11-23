package ProblemSet_3;

public class Problem8 {
	public void binarySearch(int[]arr,int min,int max,int targetelement) {
	 	while( min <= max ){ 
	 		int mid = (min + max)/2;  
	 		if ( arr[mid] < targetelement ){  
	 			min = mid + 1;     
	 		}else if(arr[mid]>targetelement){  
	 			max = mid - 1;  
	 		} else if ( arr[mid] == targetelement){  
	 			System.out.println("The index of the element is " + mid);  
	 			break;  
	 		}
	 		mid = (min + max)/2;  
	 	}  
     	if ( min > max ){  
     		System.out.println("Element is not found!");  
     	}  
	}
	public static void main(String[]args) {
		int[]arr= {9,4,7,3,8,12,15,13,24};
		new Problem8().binarySearch(arr,0,arr.length-1,15);
		
	}

}
