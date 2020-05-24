package math;

import java.util.Scanner;
/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class IsPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean k = isPrime(n);

		if (!k) {
			System.out.println("it is prime");
		} else {
			System.out.println("it is not a prime");
		}

		sc.close();

	}

	private static boolean isPrime(int n) {

		int i = 2;
		boolean val = false;

		while (i <= n / 2) {

			if (n % i == 0) {
				val = true;
				break;
			}
			i = i + 1;
		}
		return val;
	}

}
