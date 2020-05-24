package math;

import java.util.Scanner;

/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class FactorialUsingRecursion {
	
	static long factorial(long n) {
		
		if(n<=1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(factorial(n));
		
		sc.close();
		
		

	}

}
