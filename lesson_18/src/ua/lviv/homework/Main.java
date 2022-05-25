/*
 * LOGOS It Academy home work 15
 * 
 * */

package ua.lviv.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates the use of Generics.
 * @author Oleksandr
 * @param input parameters is String and Integer
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		// Home work task 1
		/**
		  * The interface List is parameterized.
 		  * The type argument specified for the parameterized type can only be a wrapper class, such as Integer, String, etc.
		  * Different types of wrapper classes cannot be added to the List simultaneously, otherwise, compiler throw errors.
		  * But, using method valueOf, we can convert a number from a string like as in the example below.
		 */
		
		List<Integer> list = new ArrayList<>();
		Integer a = Integer.valueOf("895");
		Integer y = Integer.valueOf("20");
		list.add(a);
		list.add(y);
				
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println();
		
		// Home work task 2
		
		Map<String,Integer> map = new Map<>();
		map.add("Las Vegas", 1519);
		map.add("Santo Domingo", 1498);
		map.add("Acapulco", 1525);
		map.add("San Salvador", 1525);
		map.add("Buenos Aires", 1580);
		map.add("PMontreal", 1642);
		map.add("Baltimore", 1729);
		map.add("Nashville", 1779);
		map.add("Los Angeles", 1781);
		map.add("Buffalo", 1789);
		map.add("Jacksonville", 1791);
		map.add("Greenville", 1831);
		map.add("Las Vegas", 1519);
		map.add("Brasília", 1960);
		
		System.out.println("Displayed on the screen all map:\n");
		map.showData();
		System.out.println();
		map.mapSize();
		System.out.println("\nDisplayed on the screen Set of keys:");
		map.showKey();
		
		System.out.println("\nDisplayed on the screen List of values:");
		map.showValue();
		
		System.out.println("\nremove Key");
		map.removeKey("Buffalo");
		System.out.println("remove V");
		map.removeValue(1525);
		
		System.out.println("\nDisplayed the map after removing:\n");
		map.showData();
		map.mapSize();
		
		
		//Adding in the Map new type argument
		
		System.out.println("\nThe list of cities where the Olympiad was held:\n ");
		
		MyEntry myentry = new MyEntry();
		
		Map<Integer,MyEntry> map2 = new Map<>();
		map2.add(2022, new MyEntry<String, String>("Beijing", "China"));
		map2.add(2020, new MyEntry<String, String>("Tokyo", "Japan"));
		map2.add(2016, new MyEntry<String, String>("Rio de Janeiro", "Brazil"));
		map2.add(2012, new MyEntry<String, String>("London", "United Kingdom"));
		map2.add(2008, new MyEntry<String, String>("Beijing", "China"));
		map2.add(2004, new MyEntry<String, String>("Athens", "Greece"));
		map2.add(2000, new MyEntry<String, String>("Sydney", "Australia"));
		map2.add(1996, new MyEntry<String, String>("Atlanta", "United States"));
		map2.add(1992, new MyEntry<String, String>("Barcelona", "Spain"));
		map2.add(1988, new MyEntry<String, String>("Calgary", "Canada"));
		
		map2.showData();
		map2.mapSize();
		
		System.out.println("\nDisplayed on the screen Set of keys:");
		map2.showKey();
		
		System.out.println("\nDisplayed on the screen List of values:\n");
		map2.showValue();
	
		System.out.println("\nremove K: 2022");		
		map2.removeKey(2022);
		
		System.out.println("remove V by K index");
		
		//using method getKey() assign a value of Map to the object - myentry.
		myentry = map2.getKey(1988);
		map2.removeValue(myentry);
		
		System.out.println("\nShow Map after removing key and value:\n");
		map2.showData();
		map2.mapSize();
		
	}

}
