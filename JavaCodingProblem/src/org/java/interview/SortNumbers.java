package org.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class SortNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,4,6,256,43,22,9);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		list.stream().sorted().forEach(System.out::println);
		
		
	}

}
