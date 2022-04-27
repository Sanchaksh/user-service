package com.oracle.userservice.controller;

import com.oracle.userservice.model.Flight;
import com.oracle.userservice.model.User;
import com.oracle.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users")
    public List<User> getUsers(){  return service.getUsers(); }

    @PostMapping("/user/add")
    public User save(@RequestBody User user){ return service.saveUser(user);}

    @GetMapping("/user/find/{id}")
    public Optional<User> find(@PathVariable int id){ return service.findbyId(id);}

    @PutMapping("/user/update/{id}")
    public User update(@PathVariable int id,@RequestBody User user){
        return service.update(id,user);
    }

    @DeleteMapping("/user/delete/{id}")
    public String delete(@PathVariable int id){return service.delete(id);}

    @GetMapping("/user/flights")
    public List<Flight> showFlights(){
        ResponseEntity<Flight[]> response = restTemplate.getForEntity("",Flight[].class);
        List<Flight> flights= List.of(response.getBody());
        return flights;
    }

    @GetMapping("/user/book")
    public String book(@RequestParam String src, @RequestParam String dest, @RequestParam int userid){
        int fid=restTemplate.getForObject("http://localhost:8080/flights/"+ src + "/"+ dest, Integer.class);

        String message=restTemplate.getForObject("http://localhost:8082/reservation/book" + fid + "/" + userid ,String.class);
        
        return message;
    }
}
