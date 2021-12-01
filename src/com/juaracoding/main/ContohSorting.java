package com.juaracoding.main;

public class ContohSorting {
	public static void main(String args[]) {
		//sorting
		int angka[] = {100, 95, 120, 80};
		
		for(int i = 0; i < angka.length; i++) { //loop data angka
			
			for(int j = i; j < angka.length; j++) {
				
				//cek element
				int temp = 0;
				if(angka[j]<angka[i]) {
					temp = angka[i];
					angka[i] = angka[j];
					angka[j] = temp;
				}
			}
			
			System.out.print(angka[i] + " ");
		}
	}
}
