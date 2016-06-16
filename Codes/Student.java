// SRP 
// Functionality 
public class Student { //extends Object{
	// by default the scope is default scope with in the package
//private is used to define the scope and the scope is limited to the class 
	private int rollno; //Instance Variable
private String name;
private String courseName;
private byte age;  
private final String collegeName;
/*
 * What is Constructor
 * It is used to initalize the Instance Variables and it is call when u create an object
 * Constructor Name is same as Class Name
 * U Can't Create Object with out calling Constructor
 * Constructor Doesn't have return type
 */
// Every Class has Default Constructor By Default
// It is Empty By Default and It is Doing Nothing
// Default Constructor
 private Student(){
	 //this(100,"ABCD","BCA",(byte)21);
	collegeName="SRCC";
	/*rollno  =10;
	name="Some Name";
	courseName = "MCA";
	age = 21;*/
}

// Constructor Overloading
// Create More than one constructor with different arguments

// Parameterized Constructor
Student(int rollno , String name, String courseName, byte age){
	this();  // Constructor Calling ( It Must be On First Line)
	//Student();
	this.rollno = rollno ;
	this.name = name;
	this.courseName = courseName;
	this.age = age;
}

// Assign Local Variables into Instance Variables
public void takeInput(int rollno , String name , String courseName , byte age){
	if(rollno<=0){
		System.out.println("Rollno Can't Be Zero or Negative....");
		return ;
	}
this.rollno = rollno;
this.name = name;
this.courseName = courseName;
this.age = age;
}
void print(){
	// this is a keyword and it hold the current reference
	System.out.println(  "Rollno "+this.rollno  );
	System.out.println(  "Name "+this.name  );
	System.out.println(  "Course "+courseName  );
	System.out.println(  "Age "+age);
	System.out.println("College Name "+collegeName);
}
public int hashCode(){
	return 100;
}

}
