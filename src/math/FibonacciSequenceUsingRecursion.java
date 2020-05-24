package math;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class FibonacciSequenceUsingRecursion {
	
	static int fib(int n) {
		
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> fiblist = new ArrayList<Integer>();
		
		for(int i=0 ; i < n ;i++) {
			
			fiblist.add(fib(i));
			
		}
		
		for(Integer i : fiblist) {
		System.out.println(i);
		}
		
		sc.close();
		

	}

}
