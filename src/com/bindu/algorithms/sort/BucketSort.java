package com.bindu.algorithms.sort;

public class BucketSort {
	
	private static int[] bucketSortAlgorithm(int[] in, int n) {
		// TODO Auto-generated method stub
		//int n = in.length;
		
		BucketSort s= new BucketSort();
		int[] Bucket= new int[n];
		
		//s.display(p);
		
		for(int i=0; i<n; i++) 			
			++Bucket[in[i]];
		
		System.out.println("processed data()");
		s.display(Bucket);	

		int[] sortedseq = new int[in.length];

		int outPos = 0;
	
	
		for(int i=0; i<Bucket.length; i++)
			for(int j=0; j<Bucket[i];j++)
				sortedseq[outPos++] = i;
			
			return sortedseq; 
		
		
	}

	

	private static int maxlength(int[] in) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i=0; i< in.length; i++) {
			if(in[i] > max) {
				max = in[i];
			}
		}
		//System.out.println(max);
		return max;
	}


	private void display(int[] o) {
		// TODO Auto-generated method stub
		for(int i:o) {
			System.out.print(i+"\t");
		}
	}

	private static int len(int[] process) {
		// TODO Auto-generated method stub
		int l=0;
		for(int i=0; i<process.length;i++) {
			if(process[i] > 0)
				l += process[i];
		}
		return l;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BucketSort s= new BucketSort();
		
		int[] in = {3, 2, 4, 2, 3, 5};
		int l = maxlength(in);
		System.out.println("Max. length is "+l);
		
		int[] process = new int[l+1];
		process = bucketSortAlgorithm(in,l+1);
		System.out.println("\n From main");
		s.display(process);
		
		
	}



}
