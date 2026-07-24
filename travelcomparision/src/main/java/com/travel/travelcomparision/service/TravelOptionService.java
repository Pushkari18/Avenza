package com.travel.travelcomparision.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.travelcomparision.entity.TravelOption;
import com.travel.travelcomparision.repository.TravelOptionRepository;

@Service
public class TravelOptionService {

    @Autowired
    private TravelOptionRepository repository;

    public List<TravelOption> search(
            String source,
            String destination,
            String travelType) {

        return repository.findBySourceAndDestinationAndTravelType(
                source,
                destination,
                travelType);

    }

}