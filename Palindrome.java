package task9;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str;
		int len;
		boolean flag=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		str=scan.nextLine();
//		char string[]=str.toCharArray();
		len=str.length();
		//System.out.println(len +" "+str.charAt(0)+" "+str.charAt(len-1));
		for(int i=0;i<len;i++) {		
			if(str.charAt(i)!=str.charAt(--len)) {
				flag=false;
			} 
		}
		if(flag) 
			System.out.println(" The given string "+str+" is Palindrome");
		else 
			System.out.println(" The given string "+str+" is not a Palindrome");
		scan.close();
	}

}
