package com.roommatematcher.enterprise.dto;

import lombok.Data;

public @Data
class Location {
    private String address;
    private Double totalPrice;
    private String description;
    private Boolean allowsSmoking;
    private int numberOfResidents;

}
