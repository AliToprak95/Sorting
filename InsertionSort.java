
//ALI TOPRAK

public class InsertionSort {
	static void insertionSort(int[] x) {
		for(int i=1;i<x.length;i++) {
			int key=x[i];
			int j=i;
			while(j>0 && key<x[j-1]) {
				x[j]=x[j-1];
				j--;
			}
			x[j]=key;
		}
	}
	
	static void printArray(int[] x) {
		for(int i=0;i<x.length;i++) {
			if(i==x.length-1) {
				System.out.print(x[i]);	
			}
			else {
				System.out.print(x[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] x=new int[args.length];
		for(int i=0; i<x.length;i++) {
			x[i]=Integer.parseInt(args[i]);
		}
		printArray(x);
		insertionSort(x);
		printArray(x);

	}

}
