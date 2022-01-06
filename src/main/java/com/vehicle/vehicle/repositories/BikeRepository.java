package com.vehicle.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.vehicle.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
