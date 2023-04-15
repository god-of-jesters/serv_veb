package com.example.server_s.service;

import com.example.server_s.domain.Place;

import java.util.List;

public interface PlaceService {
    Place add(Place place);

    List<Place> getAll();

    Place getById(long id);

    Place update(Place place);

    void deleteById(long id);
}
