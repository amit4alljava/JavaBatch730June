import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNo = 0;
		int secondNo  = 0;
		int result =0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the First No");
		try{
		 firstNo = scanner.nextInt();  // throw new java.util.InputMisMatchException()
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed , U Enter Something else ");
			System.out.println("Enter the First No Again");
			scanner.nextLine();
			 firstNo = scanner.nextInt();
			
		}
		System.out.println("Enter the Second No");
		try{
		secondNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed , U Enter Something else ");
			System.out.println("Enter the Second No Again");
			scanner.nextLine();
			 secondNo = scanner.nextInt();
		}
		try{
		 result = firstNo/secondNo;
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a Number with Zero "+e);
		}
		System.out.println("Result is "+result);
		scanner.close();
		
	}

}
