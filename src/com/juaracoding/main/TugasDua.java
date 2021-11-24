package com.juaracoding.main;

import java.util.Scanner;

public class TugasDua {
	
	public static void main (String args[]) {
		
		TugasDua main = new TugasDua();
		main.hitungBidang();
	}
	
	public void hitungBidang(){
		
		int panjang;
		int lebar;
		int alas;
		int sisi;
		int tinggi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pilih salah satu bidang");
		System.out.println("1. Persegi Panjang");
		System.out.println("2. Segitiga");
		System.out.println("pilih :");
		int pilih = scan.nextInt();
		
		switch(pilih) {
		case 1 :
			System.out.println("Metode penghitungan :");
			System.out.println("1. Luas");
			System.out.println("2. Keliling");
			int pilih1 = scan.nextInt();
			
			switch(pilih1) {
			case 1 :
				System.out.print("Masukan nilai panjang :");
				panjang = scan.nextInt();
				System.out.print("Masukan nilai lebar :");
				lebar = scan.nextInt();
				int hasil1 = panjang*lebar;
				System.out.print("Hasil = "+ hasil1);
			break;
			
			case 2:
				System.out.print("Masukan nilai panjang :");
				sisi = scan.nextInt();
				int hasil11 = sisi*4;
				System.out.print("Hasil = "+ hasil11);
			break;
			}
		break;
		
		case 2 :
			System.out.println("Metode penghitungan :");
			System.out.println("1. Luas");
			System.out.println("2. Keliling");
			int pilih2 = scan.nextInt();
			
			switch(pilih2) {
			case 1:
				System.out.print("Masukan nilai panjang :");
				alas = scan.nextInt();
				System.out.print("Masukan nilai lebar :");
				tinggi = scan.nextInt();
				int hasil2 = alas*tinggi/2;
				System.out.print("Hasil = "+ hasil2);
			break;
			
			case 2:
				System.out.print("Masukan nilai panjang :");
				sisi = scan.nextInt();
				int hasil22 = sisi*3;
				System.out.print("Hasil = "+ hasil22);
			break;
			}

		break;
		}
	}
}
