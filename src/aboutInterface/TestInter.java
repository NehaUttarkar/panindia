package aboutInterface;

public interface TestInter
{
	int r=50;  // by default public,static,final always
	
	void test();  //always  public, abstract
	
	public static void demo()   // this static method is present only in interface we can not call it in subclass
	{
		System.out.println(" static method of intsrface");
	}
	public default void defaultmethod() // we can write default method after jdk1.8 versions of java
	{
		System.out.println("default method of interface");
	}
	
	//public static void neha()
	//{
	//	System.out.println("hi");
	//}

	 static int n=10;
}
