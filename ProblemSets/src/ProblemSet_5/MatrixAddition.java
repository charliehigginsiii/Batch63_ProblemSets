package ProblemSet_5;

public class MatrixAddition {
	public int[][] addMatrices(int[][]arr1,int[][]arr2){
		int[][] newarr=new int[arr1.length][arr1[0].length];
		if(arr1.length!=arr2.length&&arr1[0].length!=arr2[0].length) {
			newarr=new int[0][0];
		}else {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[i].length;j++) {
					newarr[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
		}
		return newarr;
	}
	public static void main(String[]args) {
		int[][] arr1= {{5,9,3,6},{9,3,15,12},{1,4,7,8}};
		int[][] arr2= {{15,9,3,6},{8,33,15,12},{21,14,7,8}};
		int[][] newarray=new MatrixAddition().addMatrices(arr1, arr2);
		if(newarray.length==0&&newarray[0].length==0) {
			System.out.println("Arrays are not equal length.");
		}else {
			for(int i=0;i<newarray.length;i++) {
				for(int j=0;j<newarray[i].length;j++) {
					System.out.print(newarray[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
