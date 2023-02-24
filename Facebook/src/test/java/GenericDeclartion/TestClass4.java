package GenericDeclartion;

import java.util.ArrayList;
import java.util.List;

public class TestClass4 {
//Insertion
	//Deletion
	//Retrieval
	public static void main(String[] args) {
		
		//hetreogeneous collection
		ArrayList a= new ArrayList();
		a.add(34);
		a.add('$');
		a.add("Velocity");
		a.add(7823.45);
		

		//homogeneous collection
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(34);
		b.add(23);
		b.add(78);
		
		List<String> c= new ArrayList<String>();
		c.add("ghfj");
		c.add("ghfjdfrgt");	
		
	}

}
