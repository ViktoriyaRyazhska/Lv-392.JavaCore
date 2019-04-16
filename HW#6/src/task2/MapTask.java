package task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTask {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Dupont", "Kate");
		personMap.put("Palacios", "Olha");
		personMap.put("Tang", "Vika");
		personMap.put("Bobrov", "Ivan");
		personMap.put("Honiy", "Orest");
		personMap.put("Rooney", "Wayn");
		personMap.put("Malynovskyy", "Taras");
		personMap.put("Hipson", "Orest");
		personMap.put("Jordan", "Mikel");
		personMap.put("Backham", "David");

		System.out.println("Original Map: " +personMap);
		System.out.println();
		for (Map.Entry<String, String> entry : personMap.entrySet()) {

			System.out.print(entry.getKey() + " " + entry.getValue() + " | ");
		}

		// Remove persons from the map with name "Orest"

		String valueToBeRemoved = "Orest";
		for (Iterator<Map.Entry<String, String>> iter = personMap.entrySet().iterator(); iter.hasNext();) {
			Map.Entry<String, String> entry = iter.next();
			if (valueToBeRemoved.equals(entry.getValue())) {
				iter.remove();
			}
		}

		System.out.println();
		System.out.println("Modify Map: ");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {

			System.out.print(entry.getKey() + " " + entry.getValue() + " | ");
		}
	}
}
