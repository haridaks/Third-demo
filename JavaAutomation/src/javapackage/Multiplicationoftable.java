package javapackage;

import java.util.Scanner;

public class Multiplicationoftable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which table you want: ");
		int number=sc.nextInt();
		System.out.println("table for" + number + ": ");
		for (int i=1; i<=20; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		
		
		
		
		
		

	}

}
