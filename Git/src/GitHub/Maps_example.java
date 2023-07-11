package GitHub;

import java.util.HashMap;
import java.util.Map;
public class Maps_example {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		
		m.put(201, "ABCD");
		m.put(202, "EFGH");
		m.put(203, "IJKL");
		m.put(204, "MNOP");
		System.out.println(m);

		m.entrySet();
		System.out.println(m);
		
		m.remove(201);
		System.out.println(m);
		
		m.replace(202,"Keerthi");
		System.out.println(m);
		
		m.put(201, "ABCD");
		System.out.println(m);
		
		System.out.println(m.containsKey(209));
		
		System.out.println(m.containsValue("IJKL"));
		
		System.out.println(m.get(201));
		
		System.out.println(m.isEmpty());
		
		m.putIfAbsent(205, "SWATHI");
		System.out.println(m);
		
		for(Map.Entry<Integer,String> e:m.entrySet())
		{
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}


