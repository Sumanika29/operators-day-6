package com.codegnan.operatorexamples;

import java.util.Scanner;

public class PositiveNumberorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=sc.nextInt();
		String result=number>0?"Positive Number":number<0?"Negative Number":"Zero";
		System.out.println(result);
		sc.close();

	}

}
