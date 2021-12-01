package com.juaracoding.main;
import java.util.Scanner;

public class TugasPostSatu {
	public static void main (String args[]){
		 Scanner scan = new Scanner(System.in);
	     System.out.println("Masukan jumlah baris");
	     int baris = scan.nextInt();
	     
	     for(int i = 1; i <= baris; i++) {
	    	 System.out.println("###");
	     }
	}
}
