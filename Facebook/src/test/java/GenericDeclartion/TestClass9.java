package GenericDeclartion;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class TestClass9 {
	public static void main(String[] args) {
	//Key,Value
	Hashtable<Character,Integer>table=new Hashtable<Character,Integer>();
	//Insertion
	table.put('%', 34);
	table.put('$',87);
	table.put('8',34);
	table.put('H',90);
	table.put('1',23);
	//table.put(null,34);//null Key is not allowed
	//table.put('8',null);//null Value is not allowed
	
//retrieval 
for(Map.Entry<Character,Integer>s:table.entrySet())
{
	System.out.println("Key="+s.getKey()+"Value="+s.getValue());
}
		System.out.println("================");
		
        table.put('H',99);
       // table.remove('H');
		for(Map.Entry<Character,Integer>s:table.entrySet())
		{
			System.out.println("Key="+s.getKey()+"Value="+s.getValue());
		}
				
}
}