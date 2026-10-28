package Java8;

import java.util.Random;
import java.util.function.Supplier;

public class OTPSupplier {

	public static void main(String[] args) {
		
		        Supplier<String> otpSupplier = () -> {
		            Random r = new Random();
		            String otp = "";
		            for (int i = 0; i < 6; i++) {
		                otp += r.nextInt(10); // generates 0–9
		            }
		            return otp;
		        };

		        System.out.println("Generated OTP: " + otpSupplier.get());
		    }
		


	}


