package com.travel.travelcomparision.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.travelcomparision.entity.TravelOption;

@Repository
public interface TravelOptionRepository extends JpaRepository<TravelOption, Long> {

    List<TravelOption> findBySourceAndDestinationAndTravelType(
            String source,
            String destination,
            String travelType);

}