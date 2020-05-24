package math;

import java.util.Scanner;
import java.util.Stack;

public class ReverseIntegerusingStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int rem = 0;
		while(num>0) {
			rem = num % 10;
			stack.push(rem);
			num = num/10;
			
		}
		
		for(Integer i : stack) {
			System.out.print(i);
		}
		
		sc.close();
		

	}

}
