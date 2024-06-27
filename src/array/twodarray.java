package array;

public class twodarray {
	public static void main (String[] args) {
		/*int a[][]= new int[3][2];
		a[0][0]= 100;
		a[1][0]= 200;
		
		a[2][0]= 300;
		a[2][1]= 400;
		
		a[3][1]= 500;
		a[3][0]= 600;
		
		
		System.out.println(a[1][0]);
		
		;*/
		//appraoch2
		int b[][]= { {400,200},
					 {700,400},
					 {300,600} ,	 
					 
					};
		System.out.println(b.length); // prints no.of rows 
		System.out.println(b[0].length); //2 ; no of coloumns 
		System.out.println(b[1][0]);
		 for(int r=0;r<b.length;r++)
		 {
			 for(int c=0;c<b[r].length;c++)
			 {
				 System.out.print(b[r][c]+" ");
			 }
			 
			System.out.println();
		 }
		//for each loop 
		 for (int x[]:b) {
			 for (int g:x) {
				System.out.print(g+ " ");
			 }
			 System.out.println();
		 }
	}
	

}
