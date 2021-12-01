package com.juaracoding.main;

public class TugasEmpat {
	public static void main(String args[]) {
	
//	int plat = 7236;
//	int tanggal = 3;
//	
//		if(plat %2 == 0 && tanggal %2 == 0) {
//			System.out.println("Plat genap, belok kanan");
//		}
//		else {
//			System.out.println("Plat ganjil, belok kiri");
//		}
		
	// jika tanggal dan plat nomor genap = belok kanan
	// jika tanggal genap plat nomor ganjil = kamu harus belok kiri karena plat nomor ganjil
	// jika tanggal ganjil dan plat nomor ganjil = kamu harus belok kiri karena plat nomor genap
	// jika tanggal ganjil plat genap = kamu harus belok kiri karena tanggal ganjil
			
//		int tanggal = 24;
//		int plat = 7635;
//		
//		if(tanggal %2 == 0) {
//			if(plat %2 == 0) {
//				System.out.println("Kamu harus belok kanan");
//			}
//			else {
//				System.out.println("Kamu harus belok kiri, karena plat nomor " + plat + " adalah ganjil");
//			}
//		}
//		else if(tanggal %2 == 1 && plat %2 == 1) {
//			System.out.println("Kamu harus belok kiri, karena tanggal dan plat nomor ganjil");
//		}
//		else {
//			System.out.println("Kamu harus belok kiri, karena tanggal " + tanggal + "adalah ganjil");
//		}
		
		//++++++++ Operator Ternary ++++++++
		
		int nilai = 30;
		
		String keterangan;
		
		keterangan = nilai <= 75 ? "Remedial" : "Lulus";
		
		System.out.println(keterangan);
	
	}
}
