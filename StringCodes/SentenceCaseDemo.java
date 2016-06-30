import java.util.Scanner;

public class SentenceCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = scanner.nextLine();
		String words[] = str.split(" ");
		String fullStr ="";
		for(String word : words){
			// convert single char into String
			//(word.charAt(0)+"").toUpperCase()
			// String.valueOf will convert any primitive into String
			fullStr  = fullStr+String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1).toLowerCase()+" ";
			//System.out.print(String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1).toLowerCase()+" ");
		}
		System.out.println(fullStr);
	}

}
