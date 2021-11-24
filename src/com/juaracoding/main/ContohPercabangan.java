package com.juaracoding.main;
import java.util.Scanner;

public class ContohPercabangan {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
//		Contoh If else
		System.out.print("Masukkan jam berape sekarang = ");
		int jam = scan.nextInt();
		
		if(jam < 10) {
			System.out.println("Camat agiii");
		}
		else if(jam < 16) {
			System.out.println("Camat cianggg");
		}
		else if (jam < 21) {
			System.out.println("Camat colee");
		}
		else {
			System.out.println("Malam sayy");
		}
		
		
		//------ Contoh Switch Case---------
		System.out.println("Pilih menu makanan :");
		System.out.println("1. Nasi uduk");
		System.out.println("2. Nasi Rames");
		System.out.println("3. Nasi Kapau");
		System.out.print("Cepet Pilih! :");
		int menu = scan.nextInt();
		
		System.out.println("YANG ENTE PILIH ADALAH");
		switch(menu) {
		case 1:
			System.out.print("Nasi udux");
			break;
		case 2:
			System.out.print("Nasi Ramos");
			break;
		case 3:
			System.out.print("Nasi Kapau");
			break;
		}
	}
}
