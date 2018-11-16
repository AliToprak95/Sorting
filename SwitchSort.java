// MA407 EXERCISE 4
// ALI TOPRAK
// 201854644


//Worst case running time of this algorithm is O(n^2)
//Running time is worst when the array is decreasing array O(n^2)
//Running time is best possible when the array is already sorted O(n)

//Algorithm is terminates because in each iteration it sorts the part of array x[i] to end of the 
//array and subtract 1 from i until it reaches the negative values
//Algorithm is correct because if x[i] is greater than some of the elements in the array x[i+1] to end
//then it moves these elements one left and place the x[i] to the right position.



//!!!! TRUE BUT NOT INTENDED. IT HAS TO BE LIKE BUBBLE SORT

public class SwitchSort {
	
	static int a;
	
	static void randomFill (int[] x) { 
        for (int i=0; i < x.length; i++) {
            x[i] = (int) ((double) x.length * Math.random());
        }
    }
	
	static void test (int n) {
        int[] x = new int[n];
        randomFill(x);
        long time = System.currentTimeMillis();
        switchSort(x);
        time = System.currentTimeMillis() - time;
        System.out.println( "Sorting " + n + " numbers needed " + time + " ms." + "and "+ a + " switches");
    }

	static void switchSort(int[] x) {
		a=0;
		for(int i=x.length-2;i>=0;i--) {
			int key=x[i];
			int j=i;
			while(j<x.length-1 && key>x[j+1]) {
				x[j]=x[j+1];
				a++;
				j++;
			}
			x[j]=key;
			a++;
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
		switchSort(x);
		printArray(x);
		test(10_000);
		test(20_000);
		test(40_000);

	}

}
