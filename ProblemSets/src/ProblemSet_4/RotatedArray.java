package ProblemSet_4;

public class RotatedArray {
	static void Rotate(int []arr, int numberOfRotations )
	{
	    for(int i=0;i<numberOfRotations;i++) {
	    	int tempvalue=arr[0];
	    	for(int j=0;j<arr.length-1;j++) {
	    		arr[j]=arr[j+1];
	    	}
	    	arr[arr.length-1]=tempvalue;
	    }
	    
	}
	 
	    public static void main (String[] args) {
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	 
	        // Function calling
	        Rotate(arr, 2);
	        for (int i = 0; i < arr.length; i++) {
		        System.out.print(arr[i]+" ");
		    }
	    }
	}