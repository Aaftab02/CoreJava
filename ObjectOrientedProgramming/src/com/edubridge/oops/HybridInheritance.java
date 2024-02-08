package com.edubridge.oops;
// Hybrid = Hierarchial + Single
class CC{
	void disp1() {
		System.out.println("This is class CC");
	}
}
class AA extends CC{
	void disp2() {
		System.out.println("This is class AA");
	}
}
class BB extends CC{
	void disp3(){
		System.out.println("This is class BB");
	}
}
class D extends AA{
	void disp4() {
		System.out.println("This is class D");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		D obj = new D();
		obj.disp4();
		obj.disp1();
		obj.disp2();
		BB ob = new BB();
		ob.disp3();

	}

}
