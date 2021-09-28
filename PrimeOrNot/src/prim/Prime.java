package prim;

import java.util.Scanner;

public class Prime {
 public static void main(String arg[])
 {
	 Scanner readme=new Scanner(System.in);
	 System.out.println("Enter No:" );
	 int n,count=0;
	 n=readme.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 if(n%1==0)
		 {
			 count=count+1;
		 }
	 }
	 if(count==2)
	 {
		 System.out.println("The Number is PrimeNo");
	 }
	 else
	 {
		 System.out.println("Tne Number is Not a PrimeNo");
	 }
 }
}
