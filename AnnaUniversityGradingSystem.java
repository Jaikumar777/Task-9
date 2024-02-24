package task9;

import java.util.Scanner;

public class AnnaUniversityGradingSystem {

	public static void main(String[] args) {
		
		int mark;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Mark");
		mark=scan.nextInt();
		if (mark >100)
			System.out.println("Invalid Input");
		else if(mark==100)
			System.out.println("S");
		else if(mark>=90)
			System.out.println("A");
		else if(mark>=80)
			System.out.println("B");
		else if(mark>=70)
			System.out.println("C");
		else if(mark>=60)
			System.out.println("D");
		else if(mark>=50)
			System.out.println("E");
		else
			System.out.println("F");
	}

}