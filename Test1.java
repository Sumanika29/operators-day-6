package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0); 

        a--;  

        System.out.println((int)a);
        sc.close();

	}

}
