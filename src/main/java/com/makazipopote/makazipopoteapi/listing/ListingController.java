package com.makazipopote.makazipopoteapi.listing;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
//@CrossOrigin(origins = "https://makaziproperties.herokuapp.com")
public class ListingController {
    private final ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @GetMapping("/listings")
    public List<Listing> getAllListings(){
        return listingService.getListings();
    }

    @PostMapping("/listings")
    public Listing addListing(@RequestBody Listing listing){
        return listingService.addListing(listing);
    }

    @GetMapping("/listings/{id}")
    public ResponseEntity<Listing> getListingById(@PathVariable String id){
        return listingService.getListingById(id);
    }

    @PatchMapping("/listings/{id}")
    public ResponseEntity<Listing> updateListing(@PathVariable String id, @RequestBody Listing listing){
        return listingService.updateListing(id, listing);
    }

    @DeleteMapping("/listings/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteListing(@PathVariable String id){
        return (ResponseEntity<Map<String, Boolean>>) listingService.deleteListing(id);
    }
}
