package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeperatedDemo {

	public static void main(String[] args) {
		List<String>obj = Arrays.asList("","Aaftab","Adil","","Chiku","","Prince");
		String res = obj.stream().map(i->i.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(res);

	}

}
