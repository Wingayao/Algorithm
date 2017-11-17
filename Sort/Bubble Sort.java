/*
 *   bubbleSort.java
 *   demonstrates bubble sort
 *   use long[] a for example
 */
package pers.sort_bubble;

class ArrayBub {
	private long[] a;		//ref to array a
	private int nElems;		//number of data array
//..........................
	public ArrayBub(int max) {		//constructor
		a = new long[max];			//create the array
		nElems = 0;					//no items yet
	}
//..........................
	public void insert(long value) {		//put element into array
		a[nElems] = value;					//insert it
		nElems++;							//increment size
	}
//..........................
	public void display() {					//display array contents
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
	private void swap(int one, int two) {
		long temp;
		temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
//end class ArrayBub














