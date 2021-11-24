package com.juaracoding.main;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TugasSatu {
	public static void main (String args[]) {
		
		double a,b,c;
		
		DecimalFormat dec = new DecimalFormat("#.##");
		
		Scanner scan = new Scanner(System.in);
		
		//Input sisi tegak:
		System.out.print("Masukkan Sisi tegak = ");
		b = scan.nextDouble();
		
		//Input sisi datar:
		System.out.print("Masukkan Sisi Datar = ");
		c = scan.nextDouble();
		
		//Rumus Pitagoras:
		a = Math.sqrt(Math.pow(b,2) + Math.pow(c,2));
		
		//Output:
		System.out.print("Panjang miring segitiga = " + dec.format(a));
	}

}
