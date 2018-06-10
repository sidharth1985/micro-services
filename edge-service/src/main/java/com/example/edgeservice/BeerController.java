package com.example.edgeservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerController {
	
    private final BeerClient beerClient;
    
    public BeerController(BeerClient beerClient) {
    	this.beerClient=beerClient;
    }
    
	@GetMapping("/goodBeers")
	public List<Beer> getGoodBeers() {
		return beerClient.readBeers();
	}
	
	
}
