package OddEve;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readme=new Scanner(System.in);
		System.out.println("Enter the Number:" );
		int Num;
		Num=readme.nextInt();
		
		if(Num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
