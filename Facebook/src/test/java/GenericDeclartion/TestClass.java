package GenericDeclartion;

//Generic declaration
public class TestClass <Y>{
int a;
Y b; //Generic use

	public static void main(String[] args) {
		TestClass x =new TestClass();
		x.a=23;
		x.b=45;
		x.b="velocity";
		x.b='$';
		x.b= 56.56;
		x.b=new TestClass();
		
		TestClass<String> y =new TestClass<String>();
		y.a=56;
		y.b="Velocity";
		//y.b=56;   //not accepted
		//y.b='%'; //not accepted
		
		TestClass<Integer> z =new TestClass<Integer>();
		z.a=56;
	    
		z.b=56;   
		//z.b='%'; //not accepted
		//z.b="Velocity";//not accepted
	}

}
