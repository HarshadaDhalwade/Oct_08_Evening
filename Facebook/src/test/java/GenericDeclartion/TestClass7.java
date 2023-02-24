package GenericDeclartion;

import java.util.HashMap;
import java.util.Map;

public class TestClass7 {

	public static void main(String[] args) {
		//Key,Value
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		
		//Insertion
		map.put(34, "Class");
		map.put(84, "Test");
		map.put(45, "Pune");
		map.put(77, "Velocity");
		map.put(87, "Class");
		
		
		//retrival
		
	for(Map.Entry<Integer,String>s:map.entrySet())
{
	System.out.println("Key="+s.getKey()+"Value="+s.getValue());
}
		
		//Deletion
	map.remove(87);
	
	//Deletion
	//add value change
	//map.put(84, "Teasting");
		System.out.println("================");
		
		for(Map.Entry<Integer,String>s:map.entrySet())
		{
			System.out.println("Key="+s.getKey()+"Value="+s.getValue());
		}
		
		
		
		
		
		
		
	}

}
