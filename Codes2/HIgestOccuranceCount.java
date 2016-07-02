import java.util.Arrays;
import java.util.Scanner;

public class HIgestOccuranceCount {

	public static void main(String[] args) {
		int highestCount = 0;
		char highestChar ='#';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str =scanner.next(); //tyrthgfhtttvfgfhtvfdgtt
		char array[] = str.toCharArray();
		Arrays.sort(array);
		str = new String(array);
		System.out.println("After Sort "+str);
		for(int i = 0;i<str.length();i++){
			char firstChar = str.charAt(i);
			int firstIndex = str.indexOf(firstChar);
			int lastIndex = str.lastIndexOf(firstChar);
			int countOccurance = (lastIndex - firstIndex)+1;
			//System.out.println("Char is "+firstChar+" "+countOccurance);
			if(countOccurance>highestCount){
				highestCount = countOccurance;
				highestChar=firstChar;
			}
			i = lastIndex;
		}
		System.out.println("Char is "+highestChar+" "+highestCount);
		

	}

}
