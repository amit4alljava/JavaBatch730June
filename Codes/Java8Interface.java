interface K
{
	void show();
	// to define methods in interface u need to use default keyword
	default void print(){
		System.out.println("This is Interface Common Logic");
	}
}
class K1 implements K
{
	public void show(){
		System.out.println("K1 Show");
	}
}
public class Java8Interface {

	public static void main(String[] args) {
		K1 obj = new K1();
		obj.show();
		obj.print();

	}

}
