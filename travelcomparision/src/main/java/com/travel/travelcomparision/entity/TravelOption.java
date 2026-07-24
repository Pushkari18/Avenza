package com.travel.travelcomparision.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "travel_options")
public class TravelOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String source;

    private String destination;

    private String travelType;

    private String website;

    private double price;

    private String duration;

    private String facilities;

    private double rating;

    private String bookingLink;

    private String departureTime;

   private String arrivalTime;

    private int seatsLeft;

    private String busType;

    private String offer;

   private String imageUrl;

    public TravelOption() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getBookingLink() {
        return bookingLink;
    }

    public void setBookingLink(String bookingLink) {
        this.bookingLink = bookingLink;
    }
    public String getDepartureTime() {
    return departureTime;
}

public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
}

public String getArrivalTime() {
    return arrivalTime;
}

public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
}

public int getSeatsLeft() {
    return seatsLeft;
}

public void setSeatsLeft(int seatsLeft) {
    this.seatsLeft = seatsLeft;
}

public String getBusType() {
    return busType;
}

public void setBusType(String busType) {
    this.busType = busType;
}

public String getOffer() {
    return offer;
}

public void setOffer(String offer) {
    this.offer = offer;
}

public String getImageUrl() {
    return imageUrl;
}

public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
}

}