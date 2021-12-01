package com.juaracoding.main;
import java.util.Scanner;

public class AplikasiDonorDarah {
	public static void main (String args[]) {
		//Donor darag
		//usia >= 18 berat badan >= 50kg, bisa donor
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Masukkan Usia Anda : ");
		int usia = scan.nextInt();
		
		System.out.print("Masukkan Berat Badan Anda : ");
		int beratBadan = scan.nextInt();
		
//		if(usia >= 18) {
//			if(beratBadan >= 50) {
//				System.out.println("kamu bisa donor darah");
//			}
//			else {
//				System.out.println("kamu tidak bisa donor darah, karena berat badan"+ beratBadan+ "Kg. macam pemuda afrika");
//			}
//		}
//		else {
//			System.out.println("Kamu blm bisa donor darah, karena kamu udah meninggal");
//		}
		
		if(usia >= 18 && beratBadan >= 50) {
			System.out.println("kamu bisa donor darah");
		}
		else {
			System.out.println("Kamu blm bisa donor darah");
		}
	}
}
