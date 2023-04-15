package com.example.server_s.controller;

import com.example.server_s.domain.Place;
import com.example.server_s.service.impl.PlaceServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaceController {
    private final PlaceServiceimpl service;

    @Autowired
    public PlaceController(PlaceServiceimpl service) {
        this.service = service;
    }

    @PostMapping("/place")
    public Place add(@RequestBody Place place) {return service.add(place);}

    @GetMapping("/place")
    public List<Place> getAll(){
        return service.getAll();
    }

    @GetMapping("/place/{id}")
    public Place getById(@PathVariable long id){return service.getById(id);}

    @PutMapping("/place")
    public Place update(Place place){
        return service.update(place);
    }

    @DeleteMapping("/place/{id}")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
