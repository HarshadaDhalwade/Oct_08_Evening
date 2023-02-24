package GenericDeclartion;

import java.util.Hashtable;
import java.util.Map;

public class TestClass9_ {
	public static void main(String[] args) {
		//Key,Value
		Hashtable<String,Float>student1=new Hashtable<String,Float>();
		//Insertion
		student1.put("Math", 34f);
		student1.put("Science",87.56f);
		student1.put("History",34f);
		student1.put("Manul",90f);
		student1.put("Automation",23f);
		
	//retrieval 
	for(Map.Entry<String,Float>s:student1.entrySet())
	{
		System.out.println("Key="+s.getKey()+"Value="+s.getValue());
	}
			System.out.println("================");
			
			for(Map.Entry<String,Float>s:student1.entrySet())
			{
				System.out.println("Key="+s.getKey()+"Value="+s.getValue());
			}
	}				
}
