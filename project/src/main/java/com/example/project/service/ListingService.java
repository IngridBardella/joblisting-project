package com.example.project.service;

import com.example.project.dto.ListingDTO;

import java.util.List;

public interface ListingService {
    List<ListingDTO> getAllListings();

    String saveListing(ListingDTO listingDTO);

    ListingDTO getListingById(Long id);

    void deleteListingById(Long id);
}
