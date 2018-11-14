package SimpleAbstarct;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 HashMap<Integer, String> hm= new HashMap<Integer,String>();
		 hm.put(1,"sunil");
		 hm.put(2, "naveen");
		 
		 
		 ;
		 
		 for(Entry<Integer, String> m:hm.entrySet())
		 {
			System.out.println(m.getKey()+""+ m.getValue()); 
		 }
		 
		 System.out.println(hm);
	}
	
	
	
	
	

}
