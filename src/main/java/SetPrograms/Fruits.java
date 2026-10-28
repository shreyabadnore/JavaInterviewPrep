package SetPrograms;

import java.util.HashSet;
import java.util.Set;

public class Fruits {

	public static void main(String[] args) {

		Set<String> fruit = new HashSet<>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Mango");
		fruit.add("Orange");
		fruit.add("Banana");
		fruit.add("Apple"); // duplicates are not allowed hence it is not adding this

		System.out.println(fruit);

		if (fruit.contains("Banana")) {
			System.out.println("Banana is present");
		} else {
			System.out.println("Banana is not there");
		}

		fruit.remove("Apple");
		System.out.println(fruit);

	}
}
