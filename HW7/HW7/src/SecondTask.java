import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SecondTask {
	
	public static boolean SameName(Map<String, String>personMap) {
		Set<String> temporary = new HashSet<String>();
		temporary.addAll(personMap.values());
		return personMap.size() == temporary.size() ?false : true ;
		
	}
	public static void remove(Map<String, String>personMap, String firstName) {
		if(personMap.containsValue(firstName)) {
			for (Iterator<Map.Entry<String,String>> iterator  = personMap.entrySet().iterator(); iterator.hasNext();) {
				if (iterator.next().getValue().equalsIgnoreCase(firstName)){
					iterator.remove();
				}
			}
		} 
	}
	
	
	public static void main(String[]args) {
		
		Map<String, String>personMap = new HashMap<String, String>();
		
		personMap.put("Petrov", "Vasya");
		personMap.put("Wrick", "Olya");
		personMap.put("Chobot", "Taras");
		personMap.put("Tarnavskiy", "Ivan");
		personMap.put("Plyatcok", "Oleh");
		personMap.put("Yushkin", "Kostya");
		personMap.put("Petrova", "Katya");
		personMap.put("Kurochka", "Nastya");
		personMap.put("Gukov", "Orest");
		personMap.put("Byber", "Volodya");

		for (Map.Entry<String, String> entry : personMap.entrySet()) {   
			System.out.println(entry.getKey() + " " + entry.getValue());
			}
		System.out.println();
		System.out.println(SameName(personMap));
		System.out.println();
		
		remove(personMap, "Orest");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {   
			System.out.println(entry.getKey() + " " + entry.getValue());
			}
	}

}
