package com.example.restapi.service;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class HelloService {
    
    public String getGreeting(String name) {
        if (name == null || name.isBlank()) {
            return "Namaste, Duniya! 🌏";
        }
        return "Namaste, " + name + "! 🙏";
    }
    
    public String getServerTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Server time: " + now.format(formatter);
    }
}
