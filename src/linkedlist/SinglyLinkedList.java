/**
 * 
 */
package linkedlist;

import java.util.Scanner;

/**
 * @author Ramakrishna Bachu
 * @email ramankrishna10@gmail.com May 25, 2020
 */
public class SinglyLinkedList {

	public class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	Node head;

	public void append(int data) {

		if (head == null) {
			head = new Node(data);
		}
		else {
		Node current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		}        
	}

	public void printlist() {
		
		Node temp = head;

		while (temp!= null) {

			System.out.println(temp.data);
			temp = temp.next;

		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		SinglyLinkedList sll = new SinglyLinkedList();

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			sll.append(sc.nextInt());

		}

		sll.printlist();
		
		System.out.println(sll);

	}

}
