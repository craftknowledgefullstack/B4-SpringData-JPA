package com.jpa.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demo.Entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
