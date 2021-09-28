package Gre;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readme=new Scanner(System.in);
		System.out.println("Enter the Number:" );
		int n1,n2,n3;
		n1=readme.nextInt();
		n2=readme.nextInt();
		n3=readme.nextInt();
		if(n1>n2)
		{
			
			System.out.println("The Greatest Number is:"+n1);
		}
		else if(n2>n3)
		{

			System.out.println("The Greatest Number is:"+n2);
		}
		else
		{
			
			System.out.println("The Greatest Number is:"+n3);
		}
		

	}

}
