
public class Test1 extends Thread {
	 static void disp() {
		 System.out.println("Hi");
	}

	 public void run() {
		 for(int i=1;i<=10;i++ ) {
			 System.out.println(i);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1.disp();
		System.out.println("Hello");
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}

}
