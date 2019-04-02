package task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ParameterizedMethods {

	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> SetIntersection = new HashSet<Integer>();

		for (Integer i : set1) {
			for (Integer j : set2) {
				if (i == j) {
					SetIntersection.add(i);
				}
			}
		}
		return SetIntersection;
	}

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> setUnion = new HashSet<>();

		for (Integer i : set1) {
			setUnion.add(i);
		}

		for (Integer j : set2) {
			setUnion.add(j);
		}

		return setUnion;

	}

	public static void main(String[] args) {

		Random r = new Random();

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			set1.add(r.nextInt(20));
			set2.add(r.nextInt(30));
		}

		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);

		System.out.println("Union set: " + union(set1, set2));
		System.out.println("Intersect set: " + intersect(set1, set2));

	}
}
