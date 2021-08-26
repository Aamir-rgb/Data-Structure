package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UnionAndIntersectionArray5 {
	
	public static void main(String[] args) {
		int arr1[] = {1,11,14};
		int arr2[] = {1,9,5};
		
		
		List<Integer> output = IntStream.of(arr1)
				.boxed().collect(Collectors.toList()).stream().distinct().sorted().collect(Collectors.toList());
		List<Integer> output2 = IntStream.of(arr2)
				.boxed().collect(Collectors.toList()).stream().distinct().sorted().collect(Collectors.toList());
		  System.out.println(output);
		  
		  System.out.println(output2);
		  

		  List<Integer> unavailable = output.stream().filter(e -> (output2.stream().filter(d -> d.equals(e)).count()) < 1)
		    .collect(Collectors.toList());
		  List<Integer> unavailable1 = output2.stream().filter(e -> (output.stream().filter(d -> d.equals(e)).count()) < 1)
				    .collect(Collectors.toList());
		  System.out.println(unavailable+" "+unavailable1);
		  
		  List<Integer> common = output.stream().filter(e ->!unavailable.contains(e))
				    .collect(Collectors.toList());
		  System.out.println(common);
		  
	}
}
