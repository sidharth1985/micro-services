package com.example.edgeservice;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("beer-catalog-service")
@RibbonClient("beer-catalog-service")
interface BeerClient {

    @GetMapping("/all-beers")
    List<Beer> readBeers();
}