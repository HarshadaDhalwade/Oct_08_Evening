package GenericDeclartion;

import java.util.HashSet;

public class TestClass6 {

	public static void main(String[] args) {
		  HashSet<String>a =new HashSet<String>();
		  //Insertion
		  a.add("Velocity");
		  a.add("Testing");
		  a.add("Class");
		  a.add("Batch");
		  a.add("2023");
		  a.add("Class");
		  
		  //advance for loop
		  //for each
		  
		  //retrieval
		  for(String x:a)
		  {
			  System.out.println(x);
			  
		  }
		  
		  System.out.println("============");
		  
		  //deletion
		  a.remove("Batch");
		  
		  for(String x:a)
		  {
			  System.out.println(x);
		  
		  }
				
	}

}
