package com.example.server_s.service.impl;

import com.example.server_s.domain.Place;
import com.example.server_s.repository.PlaceRepository;
import com.example.server_s.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceimpl implements PlaceService {

    private final PlaceRepository placeRepository;

    @Autowired
    public PlaceServiceimpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public Place add(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public List<Place> getAll() {
        return placeRepository.findAll();
    }

    @Override
    public Place getById(long id) {
        return placeRepository.findById(id).get();
    }

    @Override
    public Place update(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public void deleteById(long id) {
        placeRepository.deleteById(id);
    }
}
