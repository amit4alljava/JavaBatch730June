
public class MutableDemo {

	public static void main(String[] args) {
		String  x = "Hello";// char array size 5
		// String internally is a char array
		// x[0] - H
		// x[1]=e
		//NewCapacity = Old Capacity * 2 + 2
		// 21 * 2 + 2 = 44
		// if(length>NewCapacity)
		//{
		//	NewCapacity = length
		//}
	
		
		 x= x + "Bye";
		//StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb = new StringBuffer(100);
		 System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("How are You gfdgdfg fd g fdg fd g fdg fd g fdg fd g fd g fdg fd g fd g");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
		
		

	}

}
