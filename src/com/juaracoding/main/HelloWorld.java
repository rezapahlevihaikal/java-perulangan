package com.juaracoding.main;
import java.text.DecimalFormat;

public class HelloWorld {
	public static void main (String args[]) {
		String x = "Reza Pahlevi Haikal";
		String y = "Bekasi";
		boolean var1, var2, var3;
		char grade = 'a';
		String nama = "nama saya";
		var1 = 10<9;
		var2 = 10>9;
		var3 = "A" == "A";
		
		double nilai = 7.56765;
		DecimalFormat df = new DecimalFormat("#.#");
		

		System.out.println("Perkenalkan, Nama saya "+ x);
		System.out.println("Saya tinggal di " + y);
		System.out.println("Nilai 1 " + var1 );
		System.out.println("Nilai 2 " + var2 );
		System.out.println("Nilai 3 " + var3 );
		System.out.println("Coba desimal = " +df.format(nilai));
	}
}
