package com.example.project.service;

import com.example.project.dto.ListingDTO;
import com.example.project.entity.Listing;

import java.util.List;

public interface ListingService {
    List<ListingDTO> getAllListings();

    Long saveListing(ListingDTO listingDTO);

    ListingDTO getListingById(Long id);

    void deleteListingById(Long id);
}
