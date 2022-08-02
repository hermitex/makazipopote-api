package com.makazipopote.makazipopoteapi.listing;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public record ListingService(ListingRepository listingRepository) {

    public Listing addListing(Listing listing){
        return listingRepository.save(listing);
    }

    public List<Listing> getListings(){
        return listingRepository.findAll();
    }

    public ResponseEntity<Listing> getListingById(String id){
        Listing listing = listingRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Listing not found!"));
        return ResponseEntity.ok(listing);
    }

    public ResponseEntity<Listing> updateListing(String id, Listing listingDetails){
        Listing listing = listingRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Listing not found"));

        listing.setName(listingDetails.getName());
        listing.setBathrooms(listingDetails.getBathrooms());
        listing.setBedrooms(listingDetails.getBathrooms());
        listing.setCategory(listingDetails.getCategory());
        listing.setCity(listingDetails.getCity());
        listing.setDescription(listingDetails.getDescription());
        listing.setPrice(listingDetails.getPrice());
        listing.setImgUrl(listingDetails.getImgUrl());
        listing.setSize(listingDetails.getSize());
        listing.setSummary(listingDetails.getSummary());
        listing.setType(listingDetails.getType());
        listing.setCounty(listingDetails.getCounty());

        Listing updatedListing = listingRepository.save(listing);

        return ResponseEntity.ok(updatedListing);

    }

    public HttpEntity<Map<String, Boolean>> deleteListing(String id){
        Listing listing = listingRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Listing not found"));

        listingRepository.delete(listing);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Listing deleted", Boolean.TRUE);

        return ResponseEntity.ok(response);
    }
}
