package com.travel.travelcomparision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.travel.travelcomparision.entity.TravelOption;
import com.travel.travelcomparision.service.TravelOptionService;

@Controller
public class SearchController {

    @Autowired
    private TravelOptionService service;

    @PostMapping("/search")
    public String search(
            @RequestParam String source,
            @RequestParam String destination,
            @RequestParam String travelType,
            Model model) {

        List<TravelOption> options =
                service.search(source, destination, travelType);

        model.addAttribute("options", options);

        return "compare";
    }

}