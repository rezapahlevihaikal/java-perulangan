package com.juaracoding.main;

import java.util.Scanner;

public class BelajarArray {
	int x = 3;
	int y = 3;
	
	int a = 6;
	int b = 6;
	
	public BelajarArray() {
		
		
		int nilai [][] = new int [x][y];
		
		// sumbu y
		for (int i = 0; i < y; i++) {
			// sumbu x
			for (int j = 0; j < x; j++) {
				nilai[j][i] = 8;
			}
		}
		
		printArray(nilai);
		//printArray(inverse(nilai));
		//printArray(diagonal(inverse(nilai)));
		//pembesaran(nilai);
	}
	
	
	public void printArray (int[][] nilai) {
		for (int i = 0; i < x; i++) {
			
			for (int j = 0; j < y; j++) {
				
				System.out.print(nilai[j][i] + " ");
			}
			
			System.out.println("");
		}
	}
	
	
	public int[][] inverse (int[][] nilai){
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				nilai[j][i] = 0;
			}
		}
		
		return nilai;
	}
	
	
	public int[][] diagonal (int[][]nilai){
		int counter = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (counter %2 == 0) {
					nilai[j][i] = 1;
				}
				counter++;
			}
			
		}
		return nilai;
	}
	
	
	public void pembesaran (int[][]nilai) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai pembesaran : ");
		int besar = scan.nextInt();
		
		int [][] dummy = new int [x*besar][y*besar];
		
		for (int i = 0; i < x*besar; i++) {
			
			for (int j = 0; j < y*besar; j++) {
				
				if (j < x && i < y) {
					System.out.print(nilai[j][i]);
				}
				else {
					System.out.print("1");
				}
			}		
			System.out.println("");
		}
	}
}
