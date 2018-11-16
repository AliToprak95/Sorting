//MA 407 ALI TOPRAK
//201854644

//EXERCISE 5.1
// (a) These scenarios are the worst scenarios, because the first elements are either the maximum or 
//     the minimum values. Therefore, recurrence formula is T(n)=T(n-1)+cn=O(n^2)
// (b)-
// (c)-



//EXERCISE 5.2
public class CountingSort {
	
	static void printintArray(int[] x, String name) { //Function for printing an integer Array
		for(int i=0;i<x.length;i++) {
			if(i<x.length-1) {System.out.print(name+"["+i+"]="+x[i]+", ");}
			else {System.out.print(name+"["+i+"]="+x[i]);}		
		}
		System.out.println();
	}
	
	
	static void countingSort(int[] x) {
		int max=x[0]; //initialization of max variable
		for(int i=0;i<x.length-1;i++) {
			if(x[i+1]>max) {
				max=x[i+1]; //updating the maximum variable
			}
		}
		int[] c=new int[max+1]; //Create a count array of size max+1
		for(int i=0;i<x.length;i++) { //Finding the number of repetition in array x
			c[x[i]]++;
		}
		
		for(int i=1;i<c.length;i++) {c[i]+=c[i-1];} //Creating the index values for x in array c
		
		int[] y=new int[x.length]; //Creating new array for sorting x
		for(int i=0;i<y.length;i++) {
			y[c[x[i]]-1]=x[i];
			c[x[i]]--;
		}

		for(int i=0;i<x.length;i++) { //copying the y to x
			x[i]=y[i];
		}
		
		
	}

	public static void main(String[] args) {
		int[] x=new int[7];
		x[0]=5;x[1]=12;x[2]=7;x[3]=9;x[4]=5;x[5]=15;x[6]=1;
		printintArray(x, "x");
		countingSort(x);
		printintArray(x, "x");

	}

}

// (c)Worst case running time for this algorithm is O(n+m), because it does only simple things 
//    in array sizes of n and m
// (d)Actually it is lower than O(nlogn) because countingSort is not a comparison algorithm