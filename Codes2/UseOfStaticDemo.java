class Student
{
	int rollno; // Instance Variable
	// Instance Variable Memory Created When Object is Created..
	
	String name;
	// I Want to Count How Many Student OBject is Created..
	static int counter;
	// To intialize the static member java has static block
	static{
		//counter = 1000; // Eager (During Class Load)
		//rollno ++;  // Lazy  (During Object Creation)
		System.out.println("Static will Call When Class is loaded");
	}
	
	// init block
	{
		System.out.println("This is Init Block and It is Pre Constructor Call");
	// U Can initalize Ur Instance Variables Here
	}
	
	// static member memory is created when class is loaded.
	// Class is loaded once 
	// Constructor is called when object is created
	// Constructor role is to initalize the instance variables
	Student(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
		this.counter++;
		System.out.println("Student Object is Created.."+
		this.rollno + " Name "+this.name+" Counter is "+this.counter);
	}
	{
		System.out.println("This is init2");
	}
}
public class UseOfStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(1001,"Ram");
		Student shyam = new Student(1002,"Shyam");

	}

}
