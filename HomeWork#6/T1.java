package myPack;
import java.util.*;
public class T1 {
	public static Set<Integer> union(Set<Integer>set1, Set<Integer> set2){
		Set<Integer>union = new HashSet<Integer>();
		union.addAll(set1);
		union.addAll(set2);
		return union;
	}
	public static Set<Integer> intersect(Set<Integer>set1, Set<Integer> set2){
		Set<Integer>intersect = new HashSet<Integer>();
		intersect.addAll(set1);
		intersect.retainAll(set2);
		return intersect;
	}
	public static void main(String[] args) {
		Random n = new Random();
		Set<Integer>set1 = new HashSet<Integer>();
		Set<Integer>set2 = new HashSet<Integer>();
		for(int i = 0; i<=20; i++) {
			set1.add(n.nextInt(11));
			set2.add(n.nextInt(21));
		}
		System.out.println(set1);
		System.out.println(set2);
		Set<Integer>unionSet = union(set1, set2);
		System.out.println(unionSet);
		Set<Integer>intersectSet = intersect(set1, set2);
		System.out.println(intersectSet);
	}
}