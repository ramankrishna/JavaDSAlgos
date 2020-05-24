package arrays;

import java.util.Scanner;
/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min = arr[i];
			}
		
		}
		
		System.out.println(min);
		sc.close();
		
	}

}
