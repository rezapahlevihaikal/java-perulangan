package com.juaracoding.main;
import java.util.Scanner;

public class ContohDoWhile {
	public static void main(String args[]) {
		boolean runing = true;
		int count = 0;
		String jawab;
		Scanner scan = new Scanner(System.in);
		
		while(runing) {
			System.out.println("Apakah anda mau keluar aplikasi?");
			System.out.println("Jawab [ya/tidak]");
			jawab = scan.nextLine();
			
			if(jawab.equalsIgnoreCase("ya")) {
				runing = false;
			}
			
			count++;
		}
		
		System.out.println("Anda sudah melakukan perulangan sebanyak "+ count + " Kali");
		
		
		
		
		
		
//		String[] buah = {"apel", "mangga", "anggur", "nanas"};
//		for(String i : buah) {
//			System.out.println(buah[0]);
//			System.out.println(i);
//		}
		
	}
}
