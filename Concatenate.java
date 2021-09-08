package ArrayPack;

import java.util.*;

// A program to concatenate 2 or more strings without using library function

public class Concatenate {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String :");
		String firstStr = sc.next();
		
		System.out.println("Enter the Second String :");
		String secondStr = sc.next();
		
		System.out.println("Enter the Third String :");
		String thirdstr = sc.next();
		
		System.out.println("Result after concatenation");
		System.out.println(firstStr+ " " + secondStr + " " + thirdstr );
		
	}
	

}
