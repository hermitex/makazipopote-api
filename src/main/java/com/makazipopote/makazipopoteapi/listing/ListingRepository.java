package com.makazipopote.makazipopoteapi.listing;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListingRepository extends MongoRepository<Listing, String> {
}
