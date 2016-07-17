import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi = 
				new FileInputStream("/Users/amit/Documents/testing/emp.dat");
		
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee e = (Employee)oi.readObject(); // Convert Bytes into Object
		e.print();
		oi.close();
		fi.close();
		

	}

}
