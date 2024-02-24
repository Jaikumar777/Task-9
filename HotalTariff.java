package task9;

import java.util.Scanner;

public class HotalTariff {

	public static void main(String[] args) {
		int month,days;
		float fixedPrice,price;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Month");
		month=scan.nextInt();
		System.out.println("Enter the price per day");
		fixedPrice=scan.nextFloat();
		System.out.println("Enter the no of days");
		days=scan.nextInt();
		switch(month) {
			case 1:
				price=fixedPrice*days;
			break;
			case 2:
				price=fixedPrice*days;
			break;
			case 3:
				price=fixedPrice*days;
			break;
			case 7:
				price=fixedPrice*days;
			break;
			case 8:
				price=fixedPrice*days;
			break;
			case 9:
				price=fixedPrice*days;
			break;
			case 10:
				price=fixedPrice*days;
			break;
			default:
				price=(fixedPrice+(fixedPrice/5))*days;
			break;
			
		}
		System.out.println("The total price is :"+price);
		System.out.println("The price will be higher if its Apr,May,Jun,Nov,Dec:");
	}

}