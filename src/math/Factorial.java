package math;

import java.util.Scanner;
/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long fact = 1 ;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
	    sc.close();	

	}

}
