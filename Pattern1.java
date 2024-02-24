package task9;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		int num,k=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		num=scan.nextInt();
		for (int i=1;i<=num;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(k++);
				if (i!=j)
					System.out.print(" ");
			}
			System.out.println();
		} 
		scan.close();
	}
	

}