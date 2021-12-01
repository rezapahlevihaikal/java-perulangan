package com.juaracoding.main;

import java.util.ArrayList;
import java.util.Scanner;

public class LatihanArrayCollections {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("Masukkan data 1 : ");
		list.add(scan.nextLine());
		System.out.print("Masukkan data 1 : ");
		list.add(scan.nextLine());
		System.out.print("Masukkan data 1 : ");
		list.add(scan.nextLine());
		
		System.out.println("Ini adalah output pertama : "+list);
		
		list.set(0, "wkwk");
		
		System.out.println("Ini adalah output kedua : "+list);
	}
}
