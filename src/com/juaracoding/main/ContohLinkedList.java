package com.juaracoding.main;

import java.util.HashSet;
import java.util.HashMap;
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
		
		System.out.println("\n");
		
		//Pakai HasSet
		HashSet data = new HashSet();
		data.add(1);
		data.add(7);
		data.add(6);
		data.add(5);
		data.add(3);
		data.add(1);
		
		System.out.println(data);
		System.out.println(data.size());
		
		System.out.println("\n");
		
		//Pakai HashMap
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England","London");
		capitalCities.put("Italy","Roma");
		capitalCities.put("German","Berlin");
		capitalCities.put("Indonesia","Jakarta");
		System.out.println(capitalCities);
		
		System.out.println("\n");
		
		HashMap<String, Integer> data2 = new HashMap<String, Integer>();
		
		data2.put("Joko", 12);
		data2.put("Reza", 20);
		data2.put("Waqyu", 19);
		data2.put("Iwan", 18);
		
		for(String i : data2.keySet()) {
			System.out.println("Key: " + i + " Value : " + data2.get(i));
		}
	}
}
