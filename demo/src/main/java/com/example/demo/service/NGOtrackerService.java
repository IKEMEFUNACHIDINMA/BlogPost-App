package com.example.demo.service;

import com.example.demo.model.NGOtracker;

import java.util.List;

public interface NGOtrackerService {

    //CREATE
    NGOtracker createNGOtracker(NGOtracker NGOtracker);

    //GET ALL
    List<NGOtracker> getNGOtracker();

    //GET BY ID
    NGOtracker getNGOtrackerbyId(Long id);

    //DELETE ALL
    String deleteNGOtracker();

    //DELETE BY ID
    String deleteNGOtrackerbyId(Long id);

    //UPDATE
    NGOtracker updateNGOtracker(Long id, NGOtracker updatedNGOtracker);

}
