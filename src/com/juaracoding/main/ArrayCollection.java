package com.juaracoding.main;

import java.util.ArrayList;

public class ArrayCollection {
	public static void main(String args[]) {
		System.out.println("Contoh ArrayList Menggunakan TipDat String :");
		ArrayList<String> mahasiswa = new ArrayList<String>();
		mahasiswa.add("Aab");
		mahasiswa.add("Budi");
		//mahasiswa.set(0,"Zaki");
		mahasiswa.add("Zaki");
		mahasiswa.add("Cita");
		System.out.println(mahasiswa);
		
		System.out.println("Contoh ArrayList Menggunakan TipDat Integer :");
		ArrayList<Integer> nilai = new ArrayList<Integer>();
		nilai.add(80);
		nilai.add(90);
		nilai.add(70);
		nilai.add(50);
		nilai.add(0,60);
		System.out.println(nilai);
		
		//ArrayList Loop
		System.out.println("Contoh ArrayList Menggunakan Model Loop :");
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Mazda");
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		//ArrayList Loop
		System.out.println("Contoh ArrayList Menggunakan For Each :");
		ArrayList<String> cars2 = new ArrayList<String>();
		cars2.add("BMW");
		cars2.add("Volvo");
		cars2.add("Ford");
		cars2.add("Mazda");
		for(String i : cars2) {
			System.out.print(i+", ");
		}
		
		//Manggil 2 tipdat langsung
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("Aab");
		nama.add("Budi");
		nama.add("Cita");
		ArrayList<String> score = new ArrayList<String>();
		score.add("23");
		score.add("30");
		score.add("45");
		System.out.println(nama.addAll(score));
		System.out.println(nama);
	}
}
