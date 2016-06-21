package com.tcs.cms.teachers;

import com.tcs.cms.students.A;

class C extends A{
	private void x(){
		System.out.println("This is X ");
	}
	void myfunction(){
		show();
	}
}
class W extends C{
	void disp(){
		show();
	}
}
public class B {

	public static void main(String[] args) {
		C obj = new C();
		obj.display();
		obj.myfunction();
		//obj.x();
		//obj.show();
		/*A obj = new A();
		obj.display();
		obj.print();
		obj.show();*/

	}

}
