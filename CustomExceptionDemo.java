import java.util.Scanner;
// Why We Override toString
// WhenEver We Print Object it will print 
//ClassName@HashCode(in HexaDecimal Format) which is meaning less for us
// the toString will attach with every object during print
// System.out.println(ramObject)  ; // internally convert into
// System.out.println(ramObject.toString());
// toString will comes from Object class, so that's why it is in every class
// If we want to print meaning ful object then override toString
class Employee{
	int id;
	String name;
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

// this is checked exception
class MinorAgeException extends Exception{
	private String msg ;
	
	MinorAgeException(){}
	MinorAgeException(String msg){
		this.msg = msg;
	}
// this is unchecked exception
//class MinorAgeException extends RuntimeException{	
@Override
public String toString(){
	if(msg!=null){
		return msg;
	}
	return "U Can't Apply For VoterID and DL";
}

}
// WhenEver u print any Object in sop it is going to call toString()
public class CustomExceptionDemo {

	public static void main(String[] args) {
		String a = new String("amit");
		System.out.println(a +"   "+a.toString());
		Employee ram = new Employee(1001,"Ram");
		System.out.println("Emp is "+ram);
		System.out.println("Emp is "+ram.toString());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		try{
		if(age<18){
			//int e = 10/0;
			throw new MinorAgeException("OOPS U Can't Apply for DL and VoterId Card , U r a Kid");
			//System.out.println("U Can't Apply For VoterID and DL");
		}
		System.out.println("Congrat Age is "+age);
		System.out.println("U Can Apply for VoterId Card");
		System.out.println("U Can Apply for Driving License");
		}
	//	catch(ArithmeticException e){
		catch(MinorAgeException e){
			System.out.println(e);  // e.toString()
			//System.out.println("U Can't Apply For VoterID and DL");
		}
	}

}
