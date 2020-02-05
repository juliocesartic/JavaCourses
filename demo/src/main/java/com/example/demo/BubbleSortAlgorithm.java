package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int [] sort(int [] numbers) {
		//Write the logic of BubbleSort
		return numbers;
	}
}
