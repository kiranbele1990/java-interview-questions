/**
 * 
 */
package org.java.interview;

import java.util.stream.IntStream;

/**
 * @author kirankadam
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Java Interview";
		char[] charArray = input.toCharArray();
		IntStream.range(0, charArray.length).mapToObj(n-> String.valueOf(charArray[(charArray.length-1)-n])).forEach(System.out::print);

	}

}
