package com.juaracoding.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Negara{
	String namaNegara;
	int populasi;
	
	public Negara(String namaNegara, int populasi) {
		this.namaNegara = namaNegara;
		this.populasi = populasi;
	}

	public String getNamaNegara() {
		return namaNegara;
	}

	public void setNamaNegara(String namaNegara) {
		this.namaNegara = namaNegara;
	}

	public int getPopulasi() {
		return populasi;
	}

	public void setPopulasi(int populasi) {
		this.populasi = populasi;
	}
	
	@Override
	public String toString() {
		return "Negara { "+ "Nama Negara = " + namaNegara + ", Populasi = " + populasi +" }";
	}
}

public class ArrayListAPI {
	
	public static void main(String []args) {
		List <Negara> negara = createList(); 
		
		List <Negara> sorted_negara = negara.stream()
				.sorted((e1, e2)-> Integer.compare(e1.getPopulasi(), e2.getPopulasi())).collect(Collectors.toList());
		
		System.out.println(sorted_negara);
	}

	static List<Negara> createList() {
		// TODO Auto-generated method stub
		List <Negara> negara = new ArrayList<>();
		negara.add(new Negara("Indonesia", 250));
		negara.add(new Negara("Malaysia", 150));
		negara.add(new Negara("Iraq", 100));
		negara.add(new Negara("Bangladesh", 4));
		return negara;
	}
}
