
public class StringDemo {

	public static void main(String[] args) {
		String a = "Hello"; // It first Check the Hello is in the Pool
		//If it is in the Pool, so it will use the same Object
		// Otherwise it will create a new Object.
		// String a = "Hello" will create 0 to 1 object
		String b = "Hello";
		b="OK";
		String c = new String("Hello");  // 2 or 1 Object
		String d = new String("Hi");
		String e = "Hi";
		// Now this will create a new object in HEAP.
		if(a==b){
		//if(a==c){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		

	}

}
