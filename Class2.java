package org.collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Class2 {
	
	public static void main(String[] args) {
		CollectionDemo a = new CollectionDemo();
		a.setDept("Mech");
		a.setStuid(231);
		a.setStuname("Nimesh");
		
	CollectionDemo b = new CollectionDemo();
		b.setDept("civil");
		b.setStuid(232);
		b.setStuname("Ajith");
	
	CollectionDemo c= new CollectionDemo();
	c.setDept("mech");
	c.setStuid(234);
	c.setStuname("Ezhil");
	
		
		List<CollectionDemo> li = new ArrayList<>();
		li.add(a);
		li.add(b);
		li.add(c);
		
		 for (int i = 0; i <li.size(); i++) {
			 
			 System.out.println(li.get(i).getStuname());
			 System.out.println(li.get(i).getStuid());
			 System.out.println(li.get(i).getDept());
		}
		 
		 Set<CollectionDemo> set = new HashSet<>();
		 set.add(a);
		 set.add(b);
		 set.add(c);
		 
		 
		 System.out.println("________________________________________________________________________________");
		 for(CollectionDemo x : set) {
			 System.out.println(x.getStuname());
			 System.out.println(x.getStuid());
			 System.out.println(x.getDept());
			 
		 }
		
		 
		 System.out.println("---------------------this is done by itterator----------------------------------");
		 Iterator<CollectionDemo> iterator = set.iterator();
		 while(iterator.hasNext()) {
			 CollectionDemo next = iterator.next();
			 System.out.println(next.getStuname());
			 System.out.println(next.getStuid());
			 System.out.println(next.getDept());			 
		 }
		
		Map<Integer, CollectionDemo>  map1 = new HashMap<>();
		map1.put(1, a);
		map1.put(2, b);
		map1.put(3, c);
		
		Set<Entry<Integer,CollectionDemo>> entrySet = map1.entrySet();
	
		for(Entry<Integer, CollectionDemo> x: entrySet) {
			 Integer key = x.getKey();
			 CollectionDemo value2 = x.getValue();
			 System.out.println(key);
			 System.out.println(value2.getStuname());
			 System.out.println(value2.getStuid());
			 System.out.println(value2.getDept());		
		}
		 
		System.out.println("---------------------this is done by itterator map----------------------------------");
		
		Iterator<Entry<Integer, CollectionDemo>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Entry<Integer,CollectionDemo> next = iterator2.next();
			Integer key = next.getKey();
			CollectionDemo value2 = next.getValue();
			System.out.println("key: "+ key);
			System.out.println(value2.getStuname());
			System.out.println(value2.getStuid());
			System.out.println(value2.getDept());
			
			
		}
		
		
		 
	}

}
