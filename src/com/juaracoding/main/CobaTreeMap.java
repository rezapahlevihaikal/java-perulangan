package com.juaracoding.main;

import java.util.TreeMap;

public class CobaTreeMap {
	public static void main(String[]args) {
		TreeMap<String, String> domains = new TreeMap<>();
		
		domains.put("my","Malaysia");
		domains.put("My","Malaysia 2");
		domains.put("Id","Indonesia 2");
		domains.put("id","Indonesia");
		domains.put("us","United States");
		domains.put("uk","Inggris");
		
		System.out.println(domains);
		System.out.println(domains.descendingMap());
	}
}
