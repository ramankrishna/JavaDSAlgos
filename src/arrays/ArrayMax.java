package arrays;

import java.util.Scanner;
/**
 * 
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com
 * May 24, 2020
 */
public class ArrayMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

		}

		System.out.println(max);
        sc.close();
	}

}
