package com.example.demo;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int [] numbers, int numberToSearchFor) {
		//Implementing Sort Logic
		
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the array
		return 3;
	}

}
