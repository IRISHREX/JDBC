package LogicBulilding;

import java.util.Scanner;

public class ReverseNumber {
	Scanner sc=new Scanner(System.in);
	void approch1(){
		
		System.out.println("APPROCH1");
		System.out.println("enter the number");
		int num1=sc.nextInt();
	
	int rev=0;
	while(num1!=0)
	{
		rev=rev*10+num1%10;
		num1=num1/10;
	}
	System.out.println("reverse number is" +rev);
	}
	
	void approch2() {
		System.out.println("APPROCH2");
		System.out.println("enter the number");
		int num2=sc.nextInt();
		StringBuffer sb= new StringBuffer(String.valueOf(num2));
		StringBuffer REV=sb.reverse();
		System.out.println("reverse number is" +REV);
	}

	public static void main(String[] args) {
		
		ReverseNumber s=new ReverseNumber();
		s.approch1();
		s.approch2();
	}

}
