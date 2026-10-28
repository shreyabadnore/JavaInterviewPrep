package ProgramPractise;

import java.util.HashMap;

public class TwoSum {
	public static int[] findTwoSumIndices(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int complement = target - num;

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i }; // return indices
			}
			map.put(num, i);
		}
		return null;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 6, 1, 7 };
		int target = 8;

		int[] result = findTwoSumIndices(arr, target);

		if (result != null) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No pair found");
		}
	}
}


//1. Take current number
//↓
//2. Calculate complement
//target - current number
//↓
//3. Check HashMap
//"Have I seen this complement?"
//↓
//4. If YES → return both indices
//If NO  → store current number + index