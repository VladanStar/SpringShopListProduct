package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
	Prodavnica prodavnica = (Prodavnica)context.getBean("prodavnica");
	System.out.println(prodavnica.toString());
	System.out.println("Menjamo bar kod hleba: ");
	prodavnica.getProizvodi().get(2).setBarKod(10004);
	System.out.println("Spiak proizvoda u prodavnici:");
	System.out.println(prodavnica.toString());
	
	
	((FileSystemXmlApplicationContext)context).close();

}
}
