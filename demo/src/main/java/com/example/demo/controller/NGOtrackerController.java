package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.NGOtracker;
import com.example.demo.service.NGOtrackerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ngotrackers")
public class NGOtrackerController {

    @Autowired
    private NGOtrackerService ngotrackerService;

    //CREATE
    @PostMapping("/addngotrackers")
    public NGOtracker createNGOtracker(@RequestBody NGOtracker ngotracker) {
        ngotrackerService.createNGOtracker(ngotracker);
        return ngotracker;
    }

    //private List<NGOtracker> ngotrackers = new ArrayList<>();

    //Read all (GET)
    @GetMapping("/get")
    public List<NGOtracker> getAllNGOtracker(){
        return ngotrackerService.getNGOtracker();
    }

    //Read by id
    @GetMapping("/{id}")
    public String getNGOtrackerbyId(@PathVariable Long id) {

        return ngotrackerService.getNGOtrackerbyId(id).toString();
    }

    //Delete (DELETE)
    @DeleteMapping("/delete")
    public String deleteNGOtracker(){

       return ngotrackerService.deleteNGOtracker();
    }

    //Delete by id
    @DeleteMapping("/{id}")
    public String deleteNGOtrackerbyId(@PathVariable Long id) {
        return ngotrackerService.deleteNGOtrackerbyId(id).toString();
    }

    //UPDATE by id
    @PutMapping("/update/{id}")
    public ResponseEntity<NGOtracker> updateNGOtracker(@PathVariable Long id, @Valid @RequestBody NGOtracker updatedNGOtracker) {
        NGOtracker updated = ngotrackerService.updateNGOtracker(id, updatedNGOtracker);
        return ResponseEntity.ok(updated);
    }

}
