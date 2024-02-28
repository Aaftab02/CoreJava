package com.edubridge.assignmentproblems;
import java.util.Scanner;
//Check the consonants and vowels and count them
public class CountingVowelsAndConsonants {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		input = input.toLowerCase();
		
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowelCount++;
			}
			else
			{
				consonantCount++;
			}
		}
		System.out.println("Number of vowels present in the string: "+vowelCount);
		System.out.println("Number of consonant present in the string: "+consonantCount);
		sc.close();
	}

}
