package com.example.demo.serviceImpl;

import com.example.demo.exceptions.HandleEventDoesNotExistException;
import com.example.demo.model.NGOtracker;
import com.example.demo.repository.NGOtrackerRepository;
import com.example.demo.service.NGOtrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NGOtrackerServiceImpl implements NGOtrackerService {
    @Autowired
    private NGOtrackerRepository ngotrackerRepository;

    @Override
    public NGOtracker createNGOtracker(NGOtracker NGOtracker) {

        NGOtracker newNGOtracker = new NGOtracker();
        newNGOtracker.setId(NGOtracker.getId());
        newNGOtracker.setFirstname(NGOtracker.getFirstname());
        newNGOtracker.setLastname(NGOtracker.getLastname());
        newNGOtracker.setEmail(NGOtracker.getEmail());
        newNGOtracker.setOfficename(NGOtracker.getOfficename());
        newNGOtracker.setNofstaffs(NGOtracker.getNofstaffs());

        ngotrackerRepository.save(newNGOtracker);
        return newNGOtracker;
    }

    @Override
    public List<NGOtracker> getNGOtracker() {

        return ngotrackerRepository.findAll();
    }

    @Override
    public NGOtracker getNGOtrackerbyId(Long id) {
        return ngotrackerRepository.getById(id.toString());
    }

    @Override
    public String deleteNGOtracker() {
        ngotrackerRepository.deleteAll();
        return "NGOtracker deleted";
    }

    @Override
    public String deleteNGOtrackerbyId(Long id) {
        ngotrackerRepository.deleteById(id.toString());
        return "This id has been deleted" + id;
    }

    @Override
    public NGOtracker updateNGOtracker(Long id, NGOtracker updatedNGOtracker) {
       NGOtracker existing = ngotrackerRepository.findById(String.valueOf(id))
               .orElseThrow(() -> new HandleEventDoesNotExistException("NGOtracker does not exist"));
       existing.setFirstname(updatedNGOtracker.getFirstname());
       existing.setLastname(updatedNGOtracker.getLastname());
       existing.setEmail(updatedNGOtracker.getEmail());
       existing.setOfficename(updatedNGOtracker.getOfficename());
       existing.setNofstaffs(updatedNGOtracker.getNofstaffs());

       return ngotrackerRepository.save(existing);

    }


}

