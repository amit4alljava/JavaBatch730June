
public class StringMethods {

	public static void main(String[] args) {
		String  x= "Hello";
		String y = "Hello";
		String z = "HELLO";
		System.out.println(x.length());
		System.out.println(x.toUpperCase());
		String text ="Hello How are You Hello";
		//int index = text.indexOf("Hello");
		int index = text.lastIndexOf("Hello");
		System.out.println("Index is "+index);
		if(index>=0){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not Found...");
		}
		if(x.equalsIgnoreCase(z)){
			System.out.println("Same Value With EqualsIgnoreCase...");
		}
		else
		{
			System.out.println("Not Same Value with EqualsIgnoreCase...");
		}
		if(x.equals(y)){
			System.out.println("Same Value");
		}
		else{
			System.out.println("Not Same Value");
		}
		
		if(x==x.toUpperCase()){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
	}

}
