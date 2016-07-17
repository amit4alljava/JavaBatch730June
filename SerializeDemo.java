import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Person
{
	int age;
	String city;
	Person(){
		System.out.println("Person Cons Call");
		//age = 21;
		//city="Delhi";
	}
}

class Employee extends Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;
	private transient String pincode;
	private double bonus=1111;
	private double hra = 2222;
	Employee(){
		System.out.println("Employee this is the default cons");
		id = 1001;
		name="Ram";
		salary = 9900;
	}
	Employee(int id , String name, double salary, String pincode){
		System.out.println("Employee Param Cons");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.pincode = pincode;
		super.age = 21;
		super.city="Delhi";
	}
	void print(){
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Pincode is "+pincode);
		System.out.println("Bonus "+bonus);
		System.out.println("HRA "+hra);
		System.out.println("Age "+super.age);
		System.out.println("City "+super.city);
	}
}
public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1001,"Shyam",6666,"A111");
		// Write Bytes into File
		FileOutputStream fo = 
				new FileOutputStream("/Users/amit/Documents/testing/emp.dat");
		
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(employee); // Write Object (// Convert Object into Bytes)
		System.out.println("Object Store in a File");
		os.close();
		fo.close();
	}

}







