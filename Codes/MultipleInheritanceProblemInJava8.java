interface Q
{
	default void show(){
		System.out.println("Q Show Logic");
	}
}
interface Q1
{
	default void show(){
		System.out.println("Q1 Show Logic");
		
	}
	
}
interface Q2 extends Q,Q1{
default void show(){
	Q.super.show();
	Q1.super.show();
	System.out.println("Q2 Show....");

}
}
class WW implements Q2
//class WW implements Q,Q1
{
//	@Override
//	public void show(){
//		Q.super.show();
//		Q1.super.show();
//		System.out.println("WW Show....");
//	}
}
public class MultipleInheritanceProblemInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WW obj = new WW();
		obj.show();
	}

}
