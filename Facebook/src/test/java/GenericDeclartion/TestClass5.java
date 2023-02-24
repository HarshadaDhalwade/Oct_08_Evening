package GenericDeclartion;

import java.util.ArrayList;

public class TestClass5 {

	public static void main(String[] args) {
		
		ArrayList<Integer>b= new ArrayList<Integer>();
		//Inseertion
		b.add(56);
		b.add(93);
		b.add(78);
		b.add(93);
		b.add(28);
		b.add(85);
		System.out.println("size= "+b.size());
		
		for(int i=0;i<b.size();i++) 
		{
			//Retrival
			System.out.println(b.get(i));
				}
		//delection
		b.remove(3);
		System.out.println("==============");

		System.out.println("size= "+b.size());
		for(int i=0;i<b.size();i++) 
		{//retrival
			System.out.println(b.get(i));
				}
		
		
		
		
		
		
		
	}

}
