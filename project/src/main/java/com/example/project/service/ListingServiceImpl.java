package com.example.project.service;

import com.example.project.dto.ListingDTO;
import com.example.project.mapper.ListingMapperHelper;
import com.example.project.repository.ListingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return null;
    }

    @Override
    public Long saveListing(ListingDTO listingDTO) {
        return null;
    }

    @Override
    public ListingDTO getListingById(Long id) {
        return null;
    }

    @Override
    public void deleteListingById(Long id) {

    }
}
