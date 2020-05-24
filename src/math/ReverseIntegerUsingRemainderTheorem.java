package math;

import java.util.Scanner;

/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class ReverseIntegerUsingRemainderTheorem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		int rem = 0;
		while(num>0) {
			
			rem = num % 10;
			rev = rev * 10 + rem; 
			num = num/10;
			
		}
		
		System.out.println(rev);
		sc.close();

	}

}
