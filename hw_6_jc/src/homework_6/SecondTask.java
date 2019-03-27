package homework_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SecondTask {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();

        personMap.put("Green", "John");
        personMap.put("Clark", "Emilia");
        personMap.put("Mona", "Liza");
        personMap.put("King", "Stephan");
        personMap.put("Sparrow", "Jack");
        personMap.put("Stark", "Arya");
        personMap.put("Martin", "George");
        personMap.put("Snow", "John");
        personMap.put("Targaryen", "Daenerys");
        personMap.put("Brown", "Bill");

        for(Map.Entry<String, String> entry: personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println();

        //remove all people with the name John
        ArrayList<String> keyArray = new ArrayList<>();

        for(Map.Entry<String, String> entry: personMap.entrySet()) {
            if (entry.getValue() == "John"){
                keyArray.add(entry.getKey());
            }
        }
        for (String i : keyArray){
            personMap.remove(i);
        }
        for(Map.Entry<String, String> entry: personMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
