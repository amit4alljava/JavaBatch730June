// Use of final 
// 1. final with class , so class can't be inherit
// 2. final with method
// 3. define constant
class W
{
	final int PF ;
	int salary;
	final int MAX_AGE =100;
	/*W(){
		//MAX_AGE=100;
	}*/
	W(int salary){
		this.salary = salary;
		PF = this.salary;
		System.out.println("PF is "+PF+" Salary is "+this.salary);
		//MAX_AGE=x;
	}
	private void output(){
		System.out.println("w Output");
	}
	void show(){
		
		System.out.println("W Show");
	}
	 final void print(int age){
		 //MAX_AGE=200;
		 if(age==MAX_AGE){
			 System.out.println("Century.....");
		 }
		System.out.println("W Print");
	}
}
/*class W1 extends W
{
	//@Override
	void print(){
		
	}
	
	@Override
	void show(){
		System.out.println("W1 Show");
	}
}*/

/*class Amit extends String{
	
}*/

/*final class A
{
	
}
class B extends A
{
	
}*/

abstract  class Account // extends Object
{
	private int x;
	double balance;
void deposit(){	
	System.out.println("Account Class Deposit Call...");
}
void withDraw(){
	System.out.println("Account Class withDraw Call...");
}
final void print(){
	
}
abstract  void roi();
/*void roi(){
	System.out.println("Account Class ROI");
}*/
}
/*class K1
{
	class K2{
		class K11 {
			
		}
		class K3 extends K11{
			void print(){
				class YY{
					void output(){
						
					}
				}
			}
		}
	}
}*/
/*class P1
{
	private int p;
	static int k;
	static  class P2{
		
	}
}*/
class SavingAccount extends Account{
	void roi(){
		System.out.println("4% Interest Rec....");
	}
}
class CurrentSaving extends Account{
	void roi(){
		System.out.println("3% Interest Pay...");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		W obj = new W(9999);
		obj.salary = obj.salary*2;
		System.out.println(obj.salary);
		//obj.PF = obj.salary;
		
		
		
		/*W1 obj = new W1();
		obj.print();
		obj.show();*/
		//obj.output();
		/*SavingAccount sa = new SavingAccount();
		//Account ac =new Account();
		sa.deposit();
		sa.withDraw();*/
		
		
		/*CurrentSaving cs = new CurrentSaving();
		
		cs.deposit();
		cs.withDraw();
		cs.interestPay();*/

	}

}
