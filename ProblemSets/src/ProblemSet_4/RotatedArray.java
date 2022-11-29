package ProblemSet_4;

public class RotatedArray {
	public void rotate(int []arr, int numberOfRotations )
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
	        int arr[] = {1,8,9,4,5,6,15};
	        new RotatedArray().rotate(arr, 2);
	        for (int i = 0; i < arr.length; i++) {
		        System.out.print(arr[i]+" ");
		    }
	    }
	}