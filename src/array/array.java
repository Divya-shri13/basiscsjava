package array;

import java.util.ArrayList;
import java.util.List;

public class array {
	public static void main(String[] args) {
//	int a[] = {1,6, 7};
//	int sum = 0;
//	for (int i=0; i<a.length; i++) {
//		sum = sum + a[i];
//		}
//for (int z=0;z<a.length;z++) {
//	int sum1 = sum-a[z];
//	System.out.println(sum1);
//}
		
//		int id=1;
//		String Name="Kumar";
//		String Address="BLR";
//		public void display() {
//			System.out.println(id+" "+Name+" "+Address);
//		}
//		public static void main(String[] args) {
//			array cs = new array();
//			cs.display();
//			
//		}
//	int id;
//	String Name;
//	String Address;
//	public void display() {
//		System.out.println(id+" "+Name+" "+Address);
//	}
//	void setdata(int id, String name, String Address) {
//		this.id=id;
//		this.Name=name;
//	    this.Address=Address;
//	}
//  	array(int id, String name, String Address){
//		this.id=id;
//		this.Name=name;
//	    this.Address=Address;
//	}
//
//	public static void main(String[] args) {
//		array cs = new array(1,"Kiran","HYD");
////		cs.setdata(1, "Kiran_Puli", "BLR");
//		cs.display();
		
//		 int a[] = {1,2, 3};
//		 int b[] = {1, 2,3, 4 , 9};
//		 StringBuilder s = new StringBuilder();
//		 for (int i = 0; i<a.length;i++) {
//			 if(a[i]==b[i]);
//			 s.append(b[i]);
//			 s.append(',');
//		 }
//		 String n = s.substring(0,s.length()-1);
//		 System.out.println(n);
			 
//		 }
//		ArrayList a = new ArrayList();
//		ArrayList<Integer> a1 =new ArrayList<Integer>();
//		ArrayList<String> a2 =new ArrayList<String>();
//		List a3 = new ArrayList();
//		a.add("45");
//		a.add("Kiran");
//		a.add(45);
//		//a.add("");
//		System.out.println(a);
//		//remove
//		a.remove(1);
//		System.out.println("after remove:"+a);
//		a.add(1, "java");
//		System.out.println("after add at Position :"+a);
//		//get the value by index
//		System.out.println("getting the Value:"+a.get(1));
//		
//		for(int i=0;i<a.size();i++) {
//			System.out.println("start  :"+a.get(i));
//		}}
//		
//		String str = "Saket Saurav";
//        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
//        for(int i= chars.length-1; i>=0; i--) {
//            System.out.print(chars[i]);
//        } }
		String str1 ="Kiran";
		int x=str1.length();
		
		String str2 ="Balaji";
		int x2=str2.length();
		
		int x3=x+x2;
		String str3=str1+str2;
		System.out.println(str3);
		
		 str2=str3.substring(0,x);
		System.out.println(str2);
		
		str1=str3.substring(x,x3);
		System.out.println(str1);
	}
}

	
