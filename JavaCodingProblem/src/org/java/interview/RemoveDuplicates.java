package org.java.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,6,53,4,5,6);
		list.stream().distinct().forEach(System.out::println);
		
		Set<Integer> intSet = new HashSet<Integer>();
		
		System.out.println("Duplicate elements");
		list.stream().filter(n -> !intSet.add(n)).collect(Collectors.toList()).forEach(System.out::println);

	}

}
;
