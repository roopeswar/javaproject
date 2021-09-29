package roopeshpackage;

public class Sectiond {

 public   void test() {
	 int b=6;             //method without static
	 
	 if (b%2==0)
		 System.out.println("even");
	 if (b%2!=0)
		 System.out.println("odd");
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =6;
		Sectiond t1=new Sectiond(); // created an object
		t1.test();
		
if(a==0)
{
	System.out.println("hello");
	
}
else if(a==10)
	System.out.println("roopesh");
else
	System.out.println("war reddy");

	}

}