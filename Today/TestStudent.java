
public class TestStudent {

	public static void main(String[] args) {
		// object is instance of a class
		int x; // x is a variable and it's type is int
		Student ram ;  // ram is a variable and it's type is Student
		// When Ever We Create an Object it is call Constructor by default
		//ram =  new Student();
		ram = new Student(1001,"Ram","Java",(byte)21);  // Has-a relationship
		ram.setAge((byte)22);
		ram.setRollno(1002);
		//ram.takeInput(1001, "Ram", "Java", (byte)21);
		/*ram.rollno = -1001;
		ram.name ="Ram";
		ram.age=-12;*/
		ram.print();
		//System.out.println("Ram is "+ram+ " Ram HashCode is "+ram.hashCode());
		//ram.rollno =1000;
		
		/*System.out.println("****************************************************");
		Student shyam = new Student();
		shyam.rollno = 1002;
		shyam.name="Shyam";
		shyam.print();*/
		/*System.out.println("Shyam is "+shyam+" Shyam HashCode is "+shyam.hashCode());
		shyam.rollno =1001;
		System.out.println(  "Rollno "+shyam.rollno  );
		System.out.println(  "Name "+shyam.name  );
		System.out.println(  "Course "+shyam.courseName  );
		System.out.println(  "Age "+shyam.age);*/
		
	}

}
