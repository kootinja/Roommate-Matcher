package com.roommatematcher.enterprise.service;

import com.roommatematcher.enterprise.dto.Location;
import org.springframework.stereotype.Component;


@Component
public class LocationServiceStub implements ILocationService {

    @Override
    public Location fetchByAddress(String address) {
        Location location = new Location();
        location.setAddress("200 warner st. Cincinnati Ohio");
        return location;
    }

    @Override
    public Location fetchByTotalPrice(Double totalPrice) {
        Location location = new Location();
        location.setTotalPrice(2000.0);
        return location;
    }

    @Override
    public Location fetchByDescription(String description) {
        Location location = new Location();
        location.setDescription("House with 5 beds 2 bath");
        return location;
    }

    @Override
    public Location fetchByAllowSmoking(Boolean allowsSmoking) {
        Location location = new Location();
        location.setAllowsSmoking(false);
        return location;
    }

    @Override
    public Location fetchByNumberOfResidents(int numberOfResidents) {
        Location location = new Location();
        location.setNumberOfResidents(3);
        return location;
    }

    @Override
    public Location fetchByPricePerResident(int numberOfResudents, double priceTotal){
        Location location = new Location();
        location.setNumberOfResidents(3);
        location.setTotalPrice(2000.0);

        return location;

    }
}
