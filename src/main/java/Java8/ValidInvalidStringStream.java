package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidInvalidStringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> valid=Arrays.asList("10", "25", "", "40", "abc", "15", "30");
		
		List<Integer> result = valid.stream()
                .filter(str -> !str.isEmpty())              // 1️⃣ remove empty strings
                .filter(str -> str.matches("\\d+"))         // 2️⃣ keep only numeric values
                .map(Integer::parseInt)                     // 3️⃣ convert String → Integer
                .filter(n -> n % 2 == 0)                    // 4️⃣ keep only even numbers
                .map(n -> n * 2)                            // 5️⃣ multiply each even number by 2
                .sorted()                                   // 6️⃣ sort ascending
                .collect(Collectors.toList());              // 7️⃣ collect to list

        System.out.println(result);

	}

}
