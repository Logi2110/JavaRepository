package javaa;

public class Variable 
{
	static int a=1;
	int b=2;
	
	public static void main(String[] args) 
	{
		int c=3;  // local variable to main()
		System.out.println(a);
	//	System.out.println(b); error because of non static reference variable b used in static method
		System.out.println(c); 
		method1();
		
		Variable iV=new Variable();
		iV.instantMethod();
	}
	
	public static void method1()
	{
        int c=5; // local variable to method1()
		System.out.println(a);
	//	System.out.println(b); error because of non static reference variable b used in static method
		System.out.println(c);
	}
	
	public void instantMethod()
	{
		System.out.println(a);
	    System.out.println(b);
	}


}
