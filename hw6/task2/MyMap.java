package ua.edu.softserve.homework.hw6.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap();

		map.put("Lenon", "Lohn");
		map.put("Stallone", "Sylvester");
		map.put("Diesel ", "Vin");
		map.put("Walker", "Paul");
		map.put("Rodriguez", "Michelle");
		map.put("Gadot", "Gal");
		map.put("Smith", "Jaden");
		map.put("Johnson", "Dwayne");
		map.put("Statham", "Jason");
		map.put("Russell", "Kurt");
		map.put("Smith", "Will");

		for (Iterator i = (map).entrySet().iterator(); i.hasNext();) {

			Map.Entry entry = (Map.Entry) i.next();

			System.out.print(entry.getValue() + " " + entry.getKey() + ", ");

		}
		System.out.println("\n");
		
		String lastName = "Smith";
		String remLastName = map.remove(lastName);
		System.out.println("I removed the last name : " + remLastName + "\n");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
