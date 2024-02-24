package task9;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number 1");
		a=scan.nextInt();
		System.out.println("Enter the Number 2");
		b=scan.nextInt();
		System.out.println("Enter the Number 3");
		c=scan.nextInt();
		if(a>b && a>c)
			System.out.println(a+" is the largest number");
		else if(b>a && b>c) 
			System.out.println(b+" is the largest number");
		else
			System.out.println(c+" is the largest number");
	}

}