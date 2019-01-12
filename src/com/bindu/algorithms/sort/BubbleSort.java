
package com.bindu.algorithms.sort;


public class BubbleSort {

	
	
	public static void main(String[] args) {
		
		BubbleSort b = new BubbleSort();
		int[] in= {5,4,2,9,6,23,96,34,45};
		b.bubbleSortAlgorithm(in);
		
		
	}

	private void display(int[] in) {
		
		for(int i=0; i<in.length; i++) {
			System.out.print(in[i]+"\t");
		}
		
	}

	private void bubbleSortAlgorithm(int[] in) {
		int n= in.length, t;
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(in[j] > in[j+1]) {
					t = in[j];
					in[j] = in[j+1];
					in[j+1] = t;
				}
			}
		}
		
		display(in);
		
	}

}
