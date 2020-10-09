package com.vladancupric;

public class Proizvod {
	private String naziv;
	private long barKod;
	
	public Proizvod() {
		super();
	}

	public Proizvod(String naziv, long barKod) {
		super();
		this.naziv = naziv;
		this.barKod = barKod;
	}
	

	public void setBarKod(long barKod) {
		this.barKod = barKod;
	}

	@Override
	public String toString() {
		return naziv + ", barkod " + barKod;
	}
	
	
	

}
