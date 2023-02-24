package GenericDeclartion;


//Generic decalrition
public class TestClass1 <Y ,D>{
int a;
Y b; //Generic use
D c;


	public static void main(String[] args) {
		
	TestClass1 x =new TestClass1();
	x.a=23;
	
	TestClass1<String,Character> y =new TestClass1<String,Character>();
	y.a=56;
	y.b="Velocity";

	y.c='%'; 
	
	TestClass1<Integer,String> z =new TestClass1<Integer,String>();
	z.a=56;
	z.b=56;   
	z.c="Velocity";
	}

}
