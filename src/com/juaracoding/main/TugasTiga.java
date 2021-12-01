package com.juaracoding.main;
import java.util.Scanner;

public class TugasTiga {
	public static void main (String args[]) {
		boolean runing = true;
		Scanner scan = new Scanner(System.in);
		double panjang, lebar, tinggi ,alas ,jari, hasil1, hasil2, hasil3;
		double phi = 3.14;
		String jawab;
		int x, count = 0;
		
		while(runing) {
			System.out.println("Pilih salah satu luas :");
			System.out.println("1. Luas Persegi Panjang");
			System.out.println("2. Luas Segitiga");
			System.out.println("3. Luas Lingkaran");
			x = scan.nextInt();
			
			switch(x) {
				case 1 :
					System.out.print("Masukan nilai panjang :");
					panjang = scan.nextInt();
					System.out.print("Masukan nilai lebar :");
					lebar = scan.nextInt();
					
					hasil1 = panjang * lebar;
					System.out.println("Hasil = "+ hasil1);
				break;
				case 2 :
					System.out.print("Masukan nilai alas :");
					alas = scan.nextInt();
					System.out.print("Masukan nilai tinggi :");
					tinggi = scan.nextInt();
					
					hasil2 = alas * tinggi / 2;
					System.out.println("Hasil = "+ hasil2);
				break;
				case 3 :
					System.out.print("Masukan nilai jari-jari :");
					jari = scan.nextInt();
					hasil3 = phi * jari * jari;
					System.out.println("Hasil = "+ hasil3);
				break;
			}
			
			System.out.println("Sudah Cukup?");
			System.out.println("Jawab [ya/tidak]");
			jawab = scan.next();
			if(jawab.equalsIgnoreCase("ya")) {
				runing = false;
				System.out.println("ADIOS");
			}
		}
		
//		count++;
		
	}
}
