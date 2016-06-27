interface X{
	void print();
	public static final int A = 10;
}
interface Y
{
	int A = 20;
	void print(int x, int y);
	Object show();
}
// Multiple Inheritance
// In Java Multiple Inheritance is Allowed only in case of interface
// No Ambiguity Problem , Methods are Empty (Abstract) 
// Interface do not have constructor
interface T extends X,Y{
void disp();	
}
class T1 implements T{

	@Override
	public void print(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object show() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}
class M{
	
}
//Wrong Way
//class Z implements X,Y extends M{
	
//}
class Z extends M implements X,Y{

	@Override
	public String show() {
		return "Abcd";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
