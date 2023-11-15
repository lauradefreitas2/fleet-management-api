package com.laboratoria.fleetmanagementapi.repository;


import com.laboratoria.fleetmanagementapi.model.TaxiLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiLocationRepository extends JpaRepository<TaxiLocation, Long> {
}

