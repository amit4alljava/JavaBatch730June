import java.util.Arrays;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		char x = a.charAt(0); // Index
		System.out.println("Single Char Get "+x);  // a[0]
		String b = "      Hello      How are You       ";
		//trim - it remove the leading and trailing spaces
		// it not remove the in between spaces
		System.out.println("Before Trim ["+b+"]");
		b= b.trim();
		System.out.println("After Trim ["+b+"]");
		System.out.println("SubString is "+a.substring(2)); // it will give the string from 2nd index
		// substring is overloaded
		 // 2 is index and 4 is position
		System.out.println("Now Again SubString "+a.substring(2, 5));
		// index always start with 0
		// position  start with 1
		int compare = "Amit".compareTo("Amit");
		System.out.println("Compare "+compare);
		a= a.concat("How");  // Memory Allocate for Hello and for How and for Hello + How
		// + vs concat
		a= a.concat("How").concat("Are").concat("You");
		a = a +"How"+"Are"+"You";
		//a.startsWith("Mr");
		if(a.endsWith("You")){
			System.out.println("Yes ");
		}
		else
		{
			System.out.println("No");
		}
		// String convert into Byte , so u can write in a file
		// also u can transfer the bytes on network
		byte barray [] = a.getBytes();
		a = "Hello How Are You".toLowerCase();
		char w[]= a.toCharArray(); // Convert String into Char Array
		Arrays.sort(w);
		// Arrays class is used to sort the primitive arrays
		String t = new String(w);  //convert char array into String
		System.out.println("After Sort "+t);
		System.out.println("After Replace "+a.replace('e', 'i'));
		String h = "Hello How are You";
		String array [] = h.split(" ");
		System.out.println("Word Count is "+array.length);
		String productCode = "FKOD-1001";
		String newProductCode = productCode.split("-")[0]+"-" +(Integer.parseInt(productCode.split("-")[1])+1) ;
		System.out.println("New Code is "+newProductCode);
	}

}











