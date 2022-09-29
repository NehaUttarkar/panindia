package aboutInterface;

public class Main 
{
public static void main(String[] args) 
{
  ABCD obj=new ABCD();
  obj.test();      // calling of method which was incomplete at interface
  System.out.println(obj.r);  // calling of final variable with help of object
  System.out.println(ABCD.r); // call variable with help of implemnted class
  System.out.println(TestInter.r); //call varible with help of interface class
  
 // obj.r=30;    // not allowed
  //obj.demo();  // not allowed
  
  obj.defaultmethod();  // calling of default method
  
  System.out.println(obj.n);  // calling of variable
}
}
