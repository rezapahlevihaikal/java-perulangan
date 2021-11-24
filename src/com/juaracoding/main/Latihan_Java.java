package com.juaracoding.main;

public class Latihan_Java {
	public static void main (String args[]) {
		//Auto
		int a = 28;
		double b = a;
		char data2 = 'W';
		long long_data = data2;
		
		//Manual
		byte c = 76;
		char l = (char) c;
		
		byte d = 79;
		char o = (char) d;
		
		byte dd = 86;
		char v = (char) dd;
		
		byte f = 69;
		char x = (char) f;
		
		System.out.println("A : "+a);
		System.out.println("Casting B :" + b);
		System.out.println("A : " + data2);
		System.out.println("Casting B :" + long_data);
		System.out.println("C : " + c);
		System.out.println("Cetak Lovv " + l+o+v+x);
	}
}
