package com.example.restapi.controller;

import com.example.restapi.model.User;
import com.example.restapi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {
    
    @Autowired
    private HelloService helloService;
    
    // GET endpoint - Simple greeting
    // Test with: curl http://localhost:8080/api/hello
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = false) String name) {
        return helloService.getGreeting(name);
    }
    
    // GET endpoint - Server time
    // Test with: curl http://localhost:8080/api/time
    @GetMapping("/time")
    public String getServerTime() {
        return helloService.getServerTime();
    }
    
    // POST endpoint - Create user
    // Test with: curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d '{"name":"Raj","email":"raj@email.com"}'
    @PostMapping("/users")
    public Map<String, String> createUser(@RequestBody User user) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "User created successfully!");
        response.put("name", user.getName());
        response.put("email", user.getEmail());
        return response;
    }
    
    // GET endpoint with path variable
    // Test with: curl http://localhost:8080/api/users/123
    @GetMapping("/users/{id}")
    public Map<String, String> getUserById(@PathVariable String id) {
        Map<String, String> response = new HashMap<>();
        response.put("userId", id);
        response.put("name", "Sample User");
        response.put("message", "User found with ID: " + id);
        return response;
    }
}
