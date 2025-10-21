package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year=sc.nextInt();
		String result=year%4==0?"Leap Year":"Non Leap Year";
		System.out.println(result);
		sc.close();

	}

}
