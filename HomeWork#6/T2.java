package myPack;
import java.util.*;
public class T2 {
	public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Shiny", "Yulia");
        personMap.put("Lovely", "Kate");
        personMap.put("Wonderful", "Orest");
        personMap.put("Good", "Jake");
        personMap.put("Great", "George");
        personMap.put("Pipe", "Tube");
        personMap.put("Hobbit", "Frodo");
        personMap.put("Well", "Played");
        personMap.put("Nice", "Alisa");
        personMap.put("Amazing", "Orest");
        for(Map.Entry<String, String> entry: personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("_________________");
        ArrayList<String> keyArray = new ArrayList<>();
        for(Map.Entry<String, String> entry: personMap.entrySet()) {
            if (entry.getValue() == "Orest"){
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