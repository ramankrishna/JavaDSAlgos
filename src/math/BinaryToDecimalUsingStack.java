package math;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class BinaryToDecimalUsingStack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String bin = sc.nextLine();
		Stack<Integer> s = new Stack<Integer>();
		double k = 0;
		int temp= 0;
		double sum = 0;
		for(int i=0;i<bin.length();i++) {
			temp = bin.charAt(i);
			if(temp==49) // 49 is the Integer value that takes for Character '1'
			s.push(1);
			else if(temp==48) // 48 is the Integer value that takes for Character '0'
			s.push(0);
		}
		while(!s.isEmpty()) {
			int num = s.pop();
			sum = Math.pow(2 , k) * num + sum;	
			k = k+1;
		}
		
		System.out.println(sum);
		sc.close();

	}

}
