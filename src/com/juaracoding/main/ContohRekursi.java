package com.juaracoding.main;
import java.util.Scanner;
public class ContohRekursi {
	
	public static void main (String args[]) {
		ContohRekursi main = new ContohRekursi();
		
		//main.rekursi();
		
		BelajarArray main2 = new BelajarArray();
		//TugasBinggo main3 = new TugasBinggo();
		
	
	}
	
	public void rekursi() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan niai yang ingin dihitung : ");
		int nilai = scan.nextInt();
		
		System.out.println("Nilainya adalah : " + totalSemua(nilai));
	}

	private int totalSemua(int nilai) {
		// TODO Auto-generated method stub
		System.out.print(nilai + " ");
		if(nilai > 0) {
			return nilai + totalSemua(nilai - 1);
		}
		else {
			System.out.println("");
			return 0;
		}
	}
}
