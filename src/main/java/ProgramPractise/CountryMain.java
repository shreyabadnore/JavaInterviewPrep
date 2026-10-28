package ProgramPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountryMain {

	public static void main(String[] args) {

		Country usa = new Country("USA", 331000000, 9834000, 5000);
		Country canada = new Country("Canada", 38000000, 9985000, 1200);
		Country india = new Country("India", 1390000000, 3287000, 1500);

		List<Country> countries = new ArrayList<>();
		countries.add(usa);
		countries.add(canada);
		countries.add(india);

		Collections.sort(countries, new Comparator<Country>() {
            public int compare(Country c1, Country c2) {
                return c1.name.compareTo(c2.name);
            }
        });

    
        System.out.println("Sorted countries:");
        for (Country c : countries) {
            System.out.println(c);
		
}
}
}
