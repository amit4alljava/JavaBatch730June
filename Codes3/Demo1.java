import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc
{
	private int add(int x , int y){
		return x + y;
	}
	private int subtract(int x , int y){
		return x - y;
	}
	Calc(){
		System.out.println("Calc Cons Call");
	}
	static{
		System.out.println("Calc Class Loaded...");
	}
}
class ScCalc{
	ScCalc(){
		System.out.println("Sc Calc Cons Call");
	}
	static{
		System.out.println("Sc Calc Class Loaded...");
	}
}
public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		// Eager Way
		//Calc calc = new Calc(); // Static Coding
		Scanner scanner = new Scanner(System.in);
		//System.setOut(new PrintStream("/Users/amit/Documents/FileHandlingTesting/abcd.txt"));
		System.out.println("Enter the Class Name ");
		String className = scanner.next();
		System.out.println("Enter the Operation Name");
		String operationName = scanner.next();
		// Dynamic Coding
		//Class.forName(className); // this is dynamic class loading
		// Dynamic Object Creation
		Object object = Class.forName(className).newInstance();
		Method method =object.getClass().getDeclaredMethod(operationName, int.class,int.class);
		method.setAccessible(true);
		Object result = method.invoke(object, 100,200);
		
		System.out.println("Result is "+result);
	}

}
