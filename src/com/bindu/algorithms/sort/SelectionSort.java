package com.bindu.algorithms.sort;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		int[] in= {5,4,2,9,6,23,96,34,45};
		s.selectionSortAlgorithm(in);
		
		
	}

	private void display(int[] in) {
		
		for(int i=0; i<in.length; i++) {
			System.out.print(in[i]+"\t");
		}
		
	}

	private void selectionSortAlgorithm(int[] in) {
		int n= in.length;
		for(int i=0; i < n-1; i++) {
			int min=i;
			for(int j= i+1; j < n; j++) 
				if(in[j] < in[min]) 
					min = j;
				
					int t = in[i];
					in[i] = in[min];
					in[min] = t;
				
			}
		
		display(in);
	}

}
