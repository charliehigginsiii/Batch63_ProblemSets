package ProblemSet_10;

public class QuickSort {
	
	public void quickSort(int[] arr, int start, int end) { 
		//Start Partitioning
		int pivot = arr[end];  
        int i = (start-1);
        for (int j=start; j<end; j++) { 
            if (arr[j] <= pivot) { 
                i++;  
					int tmp = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = tmp; 
				} 
        }
        int temp = arr[i+1]; 
        arr[i+1] = arr[end]; 
        arr[end] = temp; 
        //EndPartitioning
        
		if(start<end) {
			int index=i+1;
			if (start < index - 1) { 
				quickSort(arr, start, index - 1);
			}if (end > index) { 
				quickSort(arr, index, end); 
			} 
		}
			
		
	} 
	
	public static void main(String[]args) {
		int[]arr= {1,9,5,6,12};
		new QuickSort().quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
}
