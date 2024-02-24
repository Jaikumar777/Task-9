package task9;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		num=scan.nextInt();
		int m=1,n=num,k=1;
		for (int i=1;i<=num;i++) {
			for (int j=1;j<=num;j++) {
				if(m==j&&m==i) {
					System.out.print("*");
					m++;
				}
				else if( n==j) {
					System.out.print("*");
					n--;
				}
				else
					System.out.print(" ");
				
				}
			System.out.println();
			}
		
		}

	}
