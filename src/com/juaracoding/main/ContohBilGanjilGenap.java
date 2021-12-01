package com.juaracoding.main;
import java.util.Scanner;

public class ContohBilGanjilGenap {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int angka, jumlah = 0;
		
		System.out.print("Masukkan nilai awal : ");
		int awal = sc.nextInt();
		
		System.out.print("Masukkan nilai akhir : ");
		int akhir = sc.nextInt();
		
		for(angka = awal; angka <= akhir; angka ++) {
			if(angka %2 == 0) {
				jumlah = jumlah + angka;
				System.out.print(angka +" ");
			}
		}
	}
}
