package GenericDeclartion;

//Generic decalrition
public class TestClass3 <Y ,D>{
int a;
Y b; //Generic use

//how to use in method
Y demo(D c)
{
	 System.out.println(b);
	 return b;
}
public static void main(String[] args) {
	
	TestClass3 x =new TestClass3();
	x.a=23;
	
	TestClass3<String,Character> y =new TestClass3<String,Character>();
	y.a=56;
	y.b="Velocity";
     String data = y.demo('%');
	
}
}
