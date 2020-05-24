package math;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */

public class DecimalToBinaryUsingStack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		int num = sc.nextInt();
		int rem = 0;
		while(num>0) {
			rem = num % 2;
			s.add(rem);
			num = num/2;
		}
		
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
		
		sc.close();

	}

}
