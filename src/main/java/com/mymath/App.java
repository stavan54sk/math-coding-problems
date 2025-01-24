package com.mymath;

/**
 * Hello world!
 *
 */
public class App {

	void countDigits(int n) {

//		int counter = 0;
//		while (n > 0) {
//			n = n / 10;
//			counter++;
//		}
		System.out.println((int) Math.ceil(Math.log10(n)));
	}

	void reverseNumber(int n) {

		int rnumber = 0;
		while (n > 0) {
			int digit = n % 10;
			rnumber = (rnumber * 10) + digit;
			n = n / 10;
		}
		System.out.println(rnumber);
	}

	void palindromeNumber(int n) {
		int on = n;
		int rn = 0;
		while (n > 0) {
			int d = n % 10;
			rn = (rn * 10) + d;
			n = n / 10;
		}
		if (on == rn) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
	}

	void armstrongNumber(int n) {
		int on = n;
		int arn = 0;
		while (n > 0) {
			int d = n % 10;
			arn = (arn) + d * d * d;
			n = n / 10;
		}
		if (on == arn) {
			System.out.println("ARMSTRONG");
		} else {
			System.out.println("NOT ARMSTRONG");
		}
	}

	void divisorsNumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i + " " + n / i);
			}
		}
	}

	void primeNumber(int n) {
		int p = 1;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				p = 0;
				break;
			}
		}
		if (p == 0) {
			System.out.println("NOT PRIME");
		} else {
			System.out.println("PRIME");
		}
	}

	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
		new App().primeNumber(3456);

	}
}
