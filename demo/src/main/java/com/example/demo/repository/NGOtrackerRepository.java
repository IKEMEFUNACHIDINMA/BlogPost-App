package com.example.demo.repository;

import com.example.demo.model.NGOtracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NGOtrackerRepository extends JpaRepository<NGOtracker, String> {
    Optional<NGOtracker> findByFirstnameIgnoreCase(String firstname);

}
