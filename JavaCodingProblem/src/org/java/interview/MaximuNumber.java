package org.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MaximuNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,6,3,2,0);
		
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

		//Get maximum marks from student object
		Student st1 =  new Student("Karan",1,80);
		Student st2 =  new Student("Raj",2,60);
		Student st3 =  new Student("Rahul",5,78);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		
		studentList.parallelStream().forEach(System.out::println);
		studentList.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);
		studentList.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);
		
		
		char[] charArray = st1.getName().toCharArray();
		System.out.println("Reverse string");
		/*
		 * studentList.forEach(Function<String, String> reverse = {String reverse}
		 * reverse.apply(studentList));
		 */
		/*
		 * Function<Student, String> reverse = (Student student) -> {return
		 * IntStream.range(0,stude).mapToObj(i->
		 * charArray[(charArray.length-1)-i]).forEach(System.out::print); };
		 */
		IntStream.range(0, charArray.length).mapToObj(i-> charArray[(charArray.length-1)-i]).forEach(System.out::print);
		
		
	}

}
