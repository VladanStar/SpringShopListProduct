package com.vladancupric;

import java.util.List;

public class Prodavnica {
	private String naziv;
	private List<Proizvod> proizvodi;
	public Prodavnica() {
		super();
	}
	public Prodavnica(String naziv, List<Proizvod> proizvodi) {
		super();
		this.naziv = naziv;
		this.proizvodi = proizvodi;
	}
	
	public List<Proizvod> getProizvodi() {
		return proizvodi;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Spisak proizvoda u prodavnici: ");
		sb.append(naziv + " je: \n");
		for(Proizvod p : proizvodi) {
			sb.append(p);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	

}
