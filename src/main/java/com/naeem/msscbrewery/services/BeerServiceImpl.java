package com.naeem.msscbrewery.services;

import com.naeem.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("BlueMoon")
                .beerType("Pale Ale")
                .build();
    }
}
