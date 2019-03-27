package homework_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FirstTask {

    public static void main(String[] args) {
        // write your code here
        Set s1 = new HashSet<>();
        Random rand;
        for (int i = 0; i < 10; i++) {
            rand = new Random();
            s1.add(rand.nextInt(30));
        }

        Set s2 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            rand = new Random();
            s2.add(rand.nextInt(30));
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("union : " + union(s1, s2));
        System.out.println("intersect : " + intersect(s1, s2));
    }

    public static Set intersect(Set set1, Set set2){
//        Set result = new HashSet<>(set1);
//        result.retainAll(set2);
//        return result;

        Set result = new HashSet<>();

        ArrayList setArray1 = new ArrayList(set1);
        ArrayList setArray2 = new ArrayList(set2);

        if (setArray1.size() >= setArray2.size()){
            for (int i = 0; i < set1.size(); i++){
                if (setArray2.contains(setArray1.get(i))){
                    result.add(setArray1.get(i));
                }
            }
        }else {
            for (int i = 0; i < set2.size(); i++){
                if (setArray1.contains(setArray2.get(i))){
                    result.add(setArray2.get(i));
                }
            }
        }
        return result;
    }

    public static Set union(Set set1, Set set2){
//        Set result = new HashSet<>(set1);
//        result.addAll(set2);
//        return result;

        Set result = new HashSet();
        ArrayList setArray1 = new ArrayList(set1);
        ArrayList setArray2 = new ArrayList(set2);

        for (int i = 0; i < setArray1.size(); i++){
            result.add(setArray1.get(i));
        }

        for (int i = 0; i < setArray2.size(); i++){
            result.add(i);
        }

        return result;
    }
}
