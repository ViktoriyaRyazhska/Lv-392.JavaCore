package ua.com.lozinska.lesson7;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersect {

    public static void intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<Integer>();

        for (Integer i : set1) {
            for (Integer j : set2) {
                if (i == j) {
                    intersectionSet.add(i);
                }
            }

        }
        System.out.println("Intersection set: ");
        System.out.println(intersectionSet);

    }

    public static void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<Integer>();
        for (Integer i : set1) {
            unionSet.add(i);
        }
        for (Integer j : set2) {
            unionSet.add(j);
        }
        System.out.println("Union set: ");
        System.out.println(unionSet);

    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        set1.add(1);
        set1.add(3);
        set1.add(8);
        set1.add(12);
        set1.add(15);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);

        System.out.println("Set 1: ");
        System.out.println(set1);
        System.out.println("Set 2: ");
        System.out.println(set2);

        UnionAndIntersect.union(set1,set2);
        UnionAndIntersect.intersect(set1, set2);
    }




}

