package basicprgrms;

import java.util.Scanner;

public class swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String a = "divya";
//String b = "sri";
//System.out.println("before swapp:");
//System.out.println("a="+a);
//System.out.println("b="+b);
//String temp = a;
//a=b;
//b=temp;
//System.out.println("after swapp:");
//System.out.println("a="+a);
//System.out.println("b="+b);
//	}
		
	// swap 2 numbers 
		int x,y ;
		System.out.println("enter the values of x and y ");
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y = sc.nextInt();
		System.out.println("before swap : x="+x+"y="+y);
		x = x+y;
		y = x-y;
		x= x-y;
		System.out.println(x);
		System.out.println(y);
		
		
		
		
	}
	

}
