
// Overriding = Inheritance + Signature must be same as parent class method
//1. Weaker Access Rule
class X
{
void show(){
	System.out.println("X Show");
}
}
class Y extends X
{
	@Override
	protected void show(){
		System.out.println("Y Show");
	}
}
public class RuleOfOverride {

	public static void main(String[] args) {
		Y obj =  new Y();
		obj.show();

	}

}
