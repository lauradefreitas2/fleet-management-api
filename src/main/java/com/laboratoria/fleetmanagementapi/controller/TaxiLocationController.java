package com.laboratoria.fleetmanagementapi.controller;

import com.laboratoria.fleetmanagementapi.model.TaxiLocation;
import com.laboratoria.fleetmanagementapi.service.TaxiLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class TaxiLocationController {
    @Autowired
    private TaxiLocationService taxiLocationService;
    @GetMapping
    public List<TaxiLocation> getALLTaxiLocations() {
        return taxiLocationService.getAllTaxiLocations();
    }
}
