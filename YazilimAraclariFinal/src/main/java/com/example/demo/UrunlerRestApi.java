package com.example.demo;

import org.springframework.web.bind.annotation.*;



import java.util.*;

@RestController
@RequestMapping("/urunler")
public class UrunlerRestApi {
	
	@GetMapping("/listele")
	public List<Urunler> listele(){
		return UrunlerVeritabani.urunleriGetir();
	}
	
	@PostMapping("/ekle")
	public Urunler ekle(@RequestBody Urunler urunler) {
		UrunlerVeritabani.urunleriEkle(urunler);
		return urunler;
	}
	
	
	

}
