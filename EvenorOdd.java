package com.codegnan.operatorexamples;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		String result=number%2==0?"Even Number":"Odd Number";
		System.out.println(result);
		sc.close();

	}

}
