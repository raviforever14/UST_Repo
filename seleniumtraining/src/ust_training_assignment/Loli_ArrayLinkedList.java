package ust_training_assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Loli_ArrayLinkedList {
	
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		int n=sc.nextInt();
		for (int i=0; i<n; i++)
		q.add(sc.nextInt());

		int s=sc.nextInt();

		System.out.println(q); 
		 
		int removedele = q.remove(); 
		System.out.println("removed element : " + removedele); 

		System.out.println(q); 

		int head = q.peek(); 
		System.out.println("head of the queue : " + head); 

		int size = q.size(); 
		System.out.println("Size of the queue : " + size);
		if(q.contains(s)) {
			System.out.println("The element is present.");
		}
		else {
			System.out.println("The element is not present.");
		}
		}
		}

