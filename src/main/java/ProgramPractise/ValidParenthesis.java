package ProgramPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
	
	public static boolean isValidParenthesis(String s) {
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		for(char ch:s.toCharArray()) {
			if(map.containsKey(ch)) {
				if(stack.isEmpty()||stack.pop()!=map.get(ch)) {
					return false;
				}
			}
			else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		String s = "{[()]}";
		System.out.println(isValidParenthesis(s));
		
		s = "{[(])}";
		System.out.println(isValidParenthesis(s));
		
		s = "{{[[(())]]}}";
		System.out.println(isValidParenthesis(s));
	

	}

}
