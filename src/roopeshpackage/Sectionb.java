package roopeshpackage;

public class Sectionb {
	
		
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("m2 is running");
	
	Sectionb t1= new Sectionb (); //object creation
		t1.m1();
		t1.m2();
	    t1.m4();		}
	public void m2() { // method without static
		System.out.println("m3 is running");
	}
	public void m4() {
		int i =10;
		System.out.println("print value of i=" +i);
	}
	public void m1() {
		System.out.println("m1 is running");
	}

	}

