package ua.com.lozinska.lesson7.persone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persone {

    private static void sameNamePersone(Map<String, String> personeMap) {
        List<String> names = new ArrayList<>(personeMap.values());
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    System.out.println("Same name detected!" + names.get(i));
                }
            }
        }
    }

    private static void removingPersone(Map<String, String> personeMap) {
        while (personeMap.values().contains("Orest")) {
            personeMap.values().remove("Orest");
        }
        System.out.println("After removing Orest:");
        System.out.println(personeMap);
    }


    public static void main(String[] args) {
        Map<String, String> personeMap = new HashMap<>();
        personeMap.put("Malynovskiy", "Ivan");
        personeMap.put("Miso", "Iryna");
        personeMap.put("Rudiy", "Vasil");
        personeMap.put("Litik", "Oleg");
        personeMap.put("Kolodiy", "Ivan");
        personeMap.put("Rusiy", "Oleg");
        personeMap.put("Krutyi", "Ivan");
        personeMap.put("Chorniy", "Orest");
        personeMap.put("Siriy", "Orest");
        personeMap.put("Biliy", "Orest");

        System.out.println(personeMap);
        Persone.sameNamePersone(personeMap);
        Persone.removingPersone(personeMap);


    }
}

