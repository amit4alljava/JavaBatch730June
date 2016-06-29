import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface P
{
	void show();
	void print();
	void add();
}
// We Need to define all the methods in the class
// Prior to Java 8 We Need to implement 100% Methods of interface in class
// Adapter it is a Design Pattern
abstract class PAdapter implements P{
	public void commonLogic(){
		System.out.println("This is Common Logic ");
	}
	@Override
	public void show(){}
	@Override
	public void print(){}
	@Override
	public void add(){}
}
class P1 extends PAdapter{//implements P{

	@Override
	public void show(){
		System.out.println("This is My P1 Show");
	}
}
class P2 extends PAdapter{
	@Override
	public void print(){
		System.out.println("This is P2 Print");
	}
}
public class ProblemWithInterface {

	public static void main(String[] args) {
		WindowListener w;
		WindowAdapter w1;
		
		// TODO Auto-generated method stub

	}

}
