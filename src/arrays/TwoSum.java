package arrays;

import java.util.Scanner;


/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class TwoSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==key) {
					System.out.println(arr[i]+" "+arr[j]);
				}
				
			}
		}
		
		

	}

}
