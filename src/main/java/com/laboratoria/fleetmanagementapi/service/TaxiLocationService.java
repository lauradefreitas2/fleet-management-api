package com.laboratoria.fleetmanagementapi.service;

import com.laboratoria.fleetmanagementapi.model.TaxiLocation;
import com.laboratoria.fleetmanagementapi.repository.TaxiLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiLocationService {
    @Autowired
    private TaxiLocationRepository taxiLocationRepository;

    public List<TaxiLocation> getAllTaxiLocations() {
        return taxiLocationRepository.findAll();
    }
}
