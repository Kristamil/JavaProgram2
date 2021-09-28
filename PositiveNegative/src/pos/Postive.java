package pos;

import java.util.Scanner;

public class Postive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readme=new Scanner(System.in);
		System.out.println("Enter the Value:"  );
		int num;
		num=readme.nextInt();
		if(num>0&&num%2==0)
		{
			System.out.println("Even Positive");
		}
		else if(num<0&&num%2==0)
		{
			System.out.println("Even Negative");
		}
		else if(num==0)
		{
			System.out.println("Zero");
		}
		else if(num>0&&num%2!=0)
		{
			System.out.println("Odd Positive");
		}
		else
		{
			System.out.println("Odd Negative");
		}
	}

}
