package com.bindu.algorithms.sort;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort i = new InsertionSort();
		int[] in= {5,4,2,9,6,23,96,34,45};
		i.insertionSortAlgorithm(in);

	}

	private void display(int[] in) {
		
		for(int i=0; i<in.length; i++) {
			System.out.print(in[i]+"\t");
		}
		
	}

	private void insertionSortAlgorithm(int[] in) {
		
	}

}
