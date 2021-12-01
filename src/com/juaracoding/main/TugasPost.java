package com.juaracoding.main;
import java.util.Scanner;
public class TugasPost {
	//TUGAS NOMOR TIGA
	
	public static void main (String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("masukkan jumlah baris");
		int y = scan.nextInt();
//		for (int a=1; a<=x; a++) {
//			for(int c=1; c<=x-a; c++) {
//				System.out.print("-");
//			}
//			for (int b=1; b<=a-1; b++) {
//				System.out.print("+");
//			}
//			System.out.println("*");
//		}
		
		for (int i = 1; i <= y; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print("-");
            }
            for (int x = 1; x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
