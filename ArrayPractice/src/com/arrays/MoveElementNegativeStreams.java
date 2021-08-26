package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MoveElementNegativeStreams {
   
	static int arr[] = {13,-9,-6,-4,3,31};
	

	public static void main(String[] args) {
	
	//Obtain A Stream Of Corresponding Primitive Class
      IntStream ar = Arrays.stream(arr);
      IntStream ar1 = Arrays.stream(arr);
      
      //Convert this stream into corresponding wrapper class
      Stream<Integer> stream1 = ar.boxed();
      Stream<Integer> stream2 = ar1.boxed();
  
      //List<Integer> l3 = new ArrayList<>();
       stream1.filter(l -> l < 0).collect(Collectors.toList()).forEach(System.out::println);
       stream2.filter(l -> l > 0).collect(Collectors.toList()).forEach(System.out::println);
       
	}

}
