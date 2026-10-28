package Java8;

import java.util.function.Function;

public class MaskEmailFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, String> maskEmail = email -> {

			int atIndex = email.indexOf("@");

			String userName = email.substring(0, atIndex);

			String domain = email.substring(atIndex);

			String masked = userName.replaceAll("(?<=.).", "*");

			return masked + domain;

		};

		System.out.println(maskEmail.apply("Sam@gmail.com"));

	}

}
