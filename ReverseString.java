package task9;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str,rev = "";
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		str=scan.nextLine();
		for (int i=str.length()-1;i>=0;i--) {
			//System.out.print(str.charAt(i));
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		scan.close();
	}

}
