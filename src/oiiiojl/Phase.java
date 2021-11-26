package oiiiojl;

import java.util.Scanner;

public class Phase
     {
	
	public void sum(int a,int b )
	
	{
		
		int c=a+b;
		System.out.println(c);
	}
	
public static void main(String[] args) 
      {
	Scanner sc=new Scanner (System.in);
	
	System.out.println( "Enter 1st value=");
	int x=sc.nextInt();
	System.out.println("Enter 2nd value="  );
	int y=sc.nextInt();

	Phase a=new Phase();
	a.sum(x,y);
	          } 
  }

	
	
	

   
