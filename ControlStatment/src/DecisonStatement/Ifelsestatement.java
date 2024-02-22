package DecisonStatement;

import java.util.Scanner;

public class Ifelsestatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int a=s.nextInt(),b=s.nextInt();
		if(a>b)
		{
			System.out.println("The greater number is:"+a);
		}
		else {
			System.out.println("The greater number is:"+b);
		}

	}

}
