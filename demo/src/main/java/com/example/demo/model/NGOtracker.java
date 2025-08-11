package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "ngo_tracker")
@Getter
@Setter
@RequiredArgsConstructor
@Data
public class NGOtracker {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "id must have a value")
    private Long id;

    @NotBlank(message= "User must input office name")
    private String officename;

    @NotBlank(message= "User must input name")
    private String firstname;

    @NotBlank(message= "User must input name")
    private String lastname;

    @NotNull
    @Size(min = 1000, message="number of staffs must be less than 1000")
    private Long nofstaffs;

    @NotBlank(message = "Email must be present")
    private String email;


}
