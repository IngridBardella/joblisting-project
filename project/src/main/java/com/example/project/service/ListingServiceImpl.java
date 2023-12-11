package com.example.project.service;

import com.example.project.dto.ListingDTO;
import com.example.project.entity.Listing;
import com.example.project.mapper.ListingMapperHelper;
import com.example.project.repository.ListingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListingServiceImpl implements ListingService {

    private final ListingRepository listingRepository;
    private final ListingMapperHelper mapperHelper;

    public ListingServiceImpl(ListingRepository listingRepository, ListingMapperHelper mapperHelper) {
        this.listingRepository = listingRepository;
        this.mapperHelper = mapperHelper;
    }

    @Override
    public List<ListingDTO> getAllListings() {
        List<Listing> listings = listingRepository.findAll();
        return mapperHelper.convertListingListToListingDTOList(listings);
    }

    @Override
    public String saveListing(ListingDTO listingDTO) {
        Listing listing = mapperHelper.convertListingDTOToListing(listingDTO);
        Listing savedListing = listingRepository.save(listing);
        return savedListing.getJobTitle();
    }

    @Override
    public ListingDTO getListingById(Long id) {
        Optional<Listing> byId = listingRepository.findById(id);
        if(byId.isPresent()) {
            Listing found = byId.get();
            return mapperHelper.convertListingToListingDTO(found);
        }
        throw new RuntimeException("Unable to find listing.");
    }

    @Override
    public void deleteListingById(Long id) {
        listingRepository.deleteById(id);
    }
}
