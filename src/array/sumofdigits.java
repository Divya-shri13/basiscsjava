package array;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
        int i,sum=0;
        while (n>0){
            i=n%10;
            sum = sum+i;   // sum*i
            n=n/10;
        }
        System.out.println("sumof the digits is:"+sum);

	}

}
