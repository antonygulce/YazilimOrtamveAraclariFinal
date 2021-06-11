package com.example.demo;

import java.util.*;

public final class UrunlerVeritabani {
	
	private static final List<Urunler> URUNLER = new ArrayList<>();
	static {
		URUNLER.add(new Urunler("Samsung","Note 10 Plus") );
		URUNLER.add(new Urunler("Samsung","S20 Plus") );
		URUNLER.add(new Urunler("Samsung","S21 Neo") );
		URUNLER.add(new Urunler("Apple","Iphone X") );
		URUNLER.add(new Urunler("Apple","Iphone 15 Max") );
		URUNLER.add(new Urunler("Apple","Iphone 12 Pro") );
	}
	
	private UrunlerVeritabani() {
		
	}
	
	public static List<Urunler> urunleriGetir(){
		return URUNLER;
	}
	
	public static List<Urunler> urunleriEkle(Urunler urunler){
		URUNLER.add(urunler);
		return URUNLER;
	}
	
	public static List<Urunler> urunleriSil(String isim){
		for(Urunler u : URUNLER) {
			if(u.getIsim().equals(isim) ) {
				URUNLER.remove(u);
			}
		}
		return URUNLER;
	}
	

}
