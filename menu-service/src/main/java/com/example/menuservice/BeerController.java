package com.example.menuservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerController {

	@Autowired
	private BeerRepository beerRepository;
	
	@GetMapping("/all-beers")
	List<Beer> getAllBeers() {
		return beerRepository.findAll();
	}
	
}
