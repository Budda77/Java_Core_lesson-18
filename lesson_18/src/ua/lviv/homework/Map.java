package ua.lviv.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


import java.util.Set;

public class Map<K,V> {
	
	HashMap<K,V> map;

	public Map() {
		super();
		this.map = new HashMap<K,V>();
	}
	
	public void add(K ob1, V ob2) {
		map.put(ob1, ob2);	
	}
	
	public void showKey() {
		System.out.println(map.keySet());
	}
	
	public void showValue() {
		System.out.println(map.values());
	}
		
	public void showData() {
		Set<Entry<K,V>> entrySet = map.entrySet();
		
		for ( Entry<K,V> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	public void removeKey(K obj) {
		Iterator<Entry<K,V>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<K,V> next = iterator.next();
			if(next.getKey().equals(obj)) {
				iterator.remove();
			}
		}
	}
	
	public void removeValue(V obj) {
		Iterator<Entry<K,V>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<K,V> next = iterator.next();
			if(next.getValue().equals(obj)) {
				iterator.remove();
			}
		}
	}
	
	public void mapSize() {
		System.out.println("The size of the Map is: "+map.size());
	}

	//the method of searching for a value by its key
	public V getKey(K obj) {
		V obj2 = null;
		Set<Entry<K,V>> entrySet = map.entrySet();
		
		for ( Entry<K,V> entry : entrySet) {
			if(entry.getKey().equals(obj)) {
				 obj2 = entry.getValue();
			}
		}
		return obj2;
	}

}
