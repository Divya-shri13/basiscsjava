package array;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	   /*
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int rev = 0;
	        while (n>0){
	            int rem = n%10;
	            n=n/10;
	            rev=rev*10+rem;*/

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int rev = 0;
        while (n>0){
            int rem = n%10;
            
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("reverse number is: "+rev);

	       
	}

}
