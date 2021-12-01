package com.juaracoding.main;
import java.util.Random;
import java.util.Scanner;

public class TugasBinggo {
	String [][] allSoal = {
			
							{"A","Q","I","L"},
							{"B","A","N","D","U","N","G"},
							{"B","O","G","O","R"}
							
						  };
	
	public int angkaRandom = 0;
	boolean menang = false;
	
	
	public TugasBinggo() {
		Random rand = new Random();		
		angkaRandom = rand.nextInt(3);
		playGame();
	}
	
	
	public void playGame() {
		
		String [] jawab = new String[allSoal[angkaRandom].length];
		String [] soal = allSoal[angkaRandom];
		String jawaban = "";
		
		Scanner scan = new Scanner(System.in);
		
		while(!cekMenang(jawab)) {
			showJawab(jawab);
			System.out.print("Masukkan Jawaban : ");
			jawaban = scan.nextLine().toUpperCase();
			
			jawab = cekJawab(jawab, soal, jawaban);
		}
		
		showJawab(jawab);
		System.out.println("Selamat anda menang, terimakasih");
		
	}
	
	
	public String[] cekJawab(String[]jawab, String[]soal, String jawaban) {
		
		for(int i = 0; i < soal.length; i++) {
			
			if(soal[i].equalsIgnoreCase(jawaban)) {
				jawab[i] = jawaban;
			}
			
		}
		
		return jawab;
	}
	
	
	public void showJawab (String []jawab) {
		
		for (int i = 0; i < jawab.length; i++) {
			
			if(jawab[i] != null) {
				System.out.print(jawab[i]+" ");
			}else {
				System.out.print("_ ");
			}		
		}
		
	}
	
	
	public boolean cekMenang (String[]jawab) {
		
		for (int i = 0; i < jawab.length; i++) {
			
			if(jawab[i] == null) {
				return false;
			}
			
		}
		
		return true;
	}
}
