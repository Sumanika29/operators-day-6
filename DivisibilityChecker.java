package com.codegnan.operatorexamples;

import java.util.Scanner;

public class DivisibilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=sc.nextInt();
		String result=number%5==0?"It is Divisible by 5":"It is not Divisible by 5";
		System.out.println(result);
		sc.close();


	}

}
