package zee;

import java.util.Scanner;

public class Zero {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readme=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num;
		num=readme.nextInt();
		if(num>0||num<0)
		{
			System.out.println("Not Zero");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
