package com.juaracoding.main;

import java.util.ArrayList;

public class ArrayMatriks {
	public static void main(String []args) {
		method1();
		System.out.println();
		method2();
	}
	
	static void method1() {
		ArrayList<Integer> baris1 = new ArrayList<>();
		baris1.add(11);
		baris1.add(22);
		baris1.add(33);
		
		ArrayList<Integer> baris2 = new ArrayList<>();
		baris2.add(44);
		baris2.add(55);
		baris2.add(66);
		
		ArrayList<Integer> baris3 = new ArrayList<>();
		baris3.add(66);
		baris3.add(77);
		baris3.add(88);
		
		ArrayList<ArrayList<Integer>> matriksA = new ArrayList<>();
		matriksA.add(baris1);
		matriksA.add(baris2);
		matriksA.add(baris3);
		
//		System.out.print(matriksA);
//		System.out.print("\n");
		
		for(ArrayList<Integer> list : matriksA) {
			for(Integer n : list) {
				System.out.printf("%d ", n);
			}
			System.out.println();
		}
	}
	
	
	static void method2() {
		ArrayList<Integer> baris1 = new ArrayList<>();
		baris1.add(1);
		baris1.add(2);
		baris1.add(3);
		
		ArrayList<Integer> baris2 = new ArrayList<>();
		baris2.add(4);
		baris2.add(5);
		baris2.add(6);
		
		ArrayList<Integer> baris3 = new ArrayList<>();
		baris3.add(6);
		baris3.add(7);
		baris3.add(8);
		
		ArrayList<ArrayList<Integer>> matriksA = new ArrayList<>();
		matriksA.add(baris1);
		matriksA.add(baris2);
		matriksA.add(baris3);
		
		for(ArrayList<Integer> list : matriksA) {
			for(Integer n : list) {
				System.out.printf("%d ", n);
			}
			System.out.println();
		}
	}
	
	
}
