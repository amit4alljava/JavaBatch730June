// SAM (Single Abstract Method) Interface
@FunctionalInterface
interface Calc{
	//void add();
	int calculate(int x, int y);
}
// 1st way of using interface
// Step -1 Create a Class which implements the interface
class MyCalc implements Calc
{
	// Step-2 Override the interface method
	@Override
	public int calculate(int x, int y){
		return x + y;
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step-3 Create Object in Upcasting Style
		//Calc calc = new MyCalc();
		//System.out.println(calc.calculate(100, 200));
		
		// Anonymous Class
		// Internally 
		// class ___ implements Calc
		/*Calc calc= new Calc(){
			@Override
			public int calculate(int x, int y){
				return x * y;
			}
		};
		System.out.println("Calc is "+calc.calculate(100, 200));
		*/
		// Lambda Expression (Java 8)
		Calc c = (a,b)->{
			int d = 0;
			return a+b+d;
		};
		System.out.println("Lambda Expression "+c.calculate(1000, 2000));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
