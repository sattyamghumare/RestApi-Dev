package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                    // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor       // Generates empty constructor
@AllArgsConstructor      // Generates constructor with all arguments
public class User {
    private String name;
    private String email;
}
