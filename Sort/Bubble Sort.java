/*
 *   bubbleSort.java
 *   demonstrates bubble sort
 *   use long[] a for example
 */
package pers.sort_bubble;

//ref to array a, number of data array
class ArrayBub {
	private long[] a;
	private int nElems;
//..........................
	//constructor
	public ArrayBub(int max) {
		a = new long[max];			//create the array
		nElems = 0;					//no items yet
	}
//..........................
	//put elements into array
	public void insert(long value) {		
		a[nElems] = value;					//insert it
		nElems++;							//increment size
	}
//..........................
	//display array contents
	public void display() {
		for (int j = 0; j < nElems; j++) {		//for each element
			System.out.print(a[j] + "\t");		//display it
		}
		System.out.println("");
	}
//..........................	
	public void bubbleSort() {
		int out, in;
		
		for (out = nElems-1; out > 0; out--) {		//outer loop nElems-1 times
			for (in = 0; in < out; in++) {			//inner loop
				if (a[in] > a[in+1]) {		//out of order?
					swap(in, in+1);			//swap
				}
			}
		}
	}
//..........................
	//function swap(int, int)
	private void swap(int one, int two) {
		long temp;
		temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
//end class ArrayBub

