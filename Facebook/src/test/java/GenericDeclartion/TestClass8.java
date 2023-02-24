package GenericDeclartion;

import java.util.HashMap;
import java.util.Map;

public class TestClass8 {
	
	public static void main(String[] args) {
		//Key,Value
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		
	map.put(null, "Class");
	map.put(84, "Test");
	map.put(45, null);
	map.put(77, "Velocity");
	map.put(87, null);
	//retrieval
	for(Map.Entry<Integer,String>s:map.entrySet())
	{
		System.out.println("Key="+s.getKey()+"Value="+s.getValue());
	}
			
			//Deletion	
		map.put(null, "Teasting");
			System.out.println("================");
			
			for(Map.Entry<Integer,String>s:map.entrySet())
			{
				System.out.println("Key="+s.getKey()+"Value="+s.getValue());
			}
}
}