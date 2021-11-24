package com.juaracoding.main;

public class NestedIf {
	public static void main (String args[]) {
		NestedIf main = new NestedIf();
		main.cekPajakMulti();
		
	}
	
	public static void cekPajak() {
		String jeniskelamin = "wanita";
		boolean menikah = false;
		
		int pajak = 0;
		
		if(jeniskelamin.equalsIgnoreCase("pria")) {
			if(menikah) {
				pajak = 4;
			}
			else {
				pajak = 10;
			}
		}
		else {
			if(menikah) {
				pajak = 4;
			}
			else {
				pajak = 11;
			}
		}
		
		System.out.println("pajak anda adalah : "+ pajak + "%");
	}
	
	public void cekPajakMulti() {
		String jeniskelamin = "male";
		boolean menikah = true;
		
		int pajak = 0;
		
		switch (jeniskelamin) {
		case "female":
		case "male":
		case "intersex":
		case "trans":
			
			if(menikah) {
				pajak = 5;
			}
			else {
				pajak = 10;
			}
			break;
			
		case "non_conforming":
		case "personal":
		case "eunuch":
			pajak = 10;
			break;
			
		default:
			
			pajak = 8;
			break;
		}
		
		System.out.println("Pajak anda adalah "+pajak+"%");
	}
}
