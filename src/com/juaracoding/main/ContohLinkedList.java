package com.juaracoding.main;

import java.util.LinkedList;

public class ContohLinkedList {
	public static void main (String args[]) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Data 1");
		linkedList.add("Data 2");
		linkedList.add("Data 3");
		linkedList.add("Data 4");
		linkedList.add("Data 5");
		
		System.out.println("output : "+linkedList+", ukuran : "+linkedList.size());
		
		linkedList.addFirst("Data 0");
		linkedList.addLast("Data 6");
		
		System.out.println("output : "+linkedList+", ukuran : "+linkedList.size());
		
		linkedList.set(0,"Data 11");
		linkedList.set(6,"Data 12");
		
		System.out.println("output : "+linkedList+", ukuran : "+linkedList.size());
		
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println("output : "+linkedList+", ukuran : "+linkedList.size());
		
		linkedList.remove(4);
		
		System.out.println("output : "+linkedList+", ukuran : "+linkedList.size());
	}
}
