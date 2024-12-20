package com.example.Hello.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Utility {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String utilityId;
    private String utilityName;
    private String icon;

}
