package com.roommatematcher.enterprise.service;

import com.roommatematcher.enterprise.dto.Location;

public interface ILocationService {
    Location fetchByAddress(String address);

    Location fetchByTotalPrice(Double totalPrice);

    Location fetchByDescription(String description);

    Location fetchByAllowSmoking(Boolean allowsSmoking);

    Location fetchByNumberOfResidents(int numberOfResidents);

    Location fetchByPricePerResident(int numberOfResudents, double priceTotal);
}
