
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("How"); // add in end
		System.out.println("Now After Append "+sb);
		sb.insert(0, "Hi"); // 0 is index
		System.out.println("After Insert "+sb);
		//sb.deleteCharAt(0); // to delete single char
		sb.delete(0, 3); // Multi char 0 is index and 3 is position
		System.out.println("After Delete "+sb);
		sb.charAt(0);
		sb.ensureCapacity(1000);
		System.out.println("After Ensure Capacity ");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.ensureCapacity(500);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.indexOf("How");
		sb.lastIndexOf("How");
		sb.reverse();
		String w = sb.toString(); // StringBuffer to String convert
		StringBuffer x= new StringBuffer("Hello");
		StringBuffer y = new StringBuffer("Hello");
		// StringBuffer not have equals method it is using the same Object 
		// class equals method
		// Object class equals method it compare references it not compare strings
		String ee = new String("amit");
		String ww= new String("amit");
		if(ee.equals(ww)){
			System.out.println("String are Same");
		}
		else
		{
			System.out.println("String are not same");
		}
		
		if(x.toString().equals(y.toString())){
			System.out.println("Same ");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		
		
		
		

	}

}
