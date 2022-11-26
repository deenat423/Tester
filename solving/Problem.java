package org.solving;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=input.nextInt();
		int count=0;
		for (int i = 2; i <= n/2; i++) {
			if (n%i==0) {
				count=1;
			}
			
		}
		if (count==0) {
		System.out.println("prime number");	
		}else {
			System.out.println("not prime number");
		}
		
		
		
		
		
		
	}

}
