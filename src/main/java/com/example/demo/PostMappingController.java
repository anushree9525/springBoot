package com.example.demo;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PostMappingController

{
	
	
	@Autowired
	 private UserRepo userRepo;
	
	@GetMapping(value= "/users")
    public List<employee1> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody employee1 user) {
        userRepo.save(user);
        return "Data Saved in DataBase";
    }

    @PutMapping(value = "update/{Id}")
    public String updatedemloyee1(@PathVariable long Id, @RequestBody employee1 user){

        employee1 updatedemployee1 = userRepo.findById(Id).get();
        updatedemployee1.setEmpName(user.getEmpName());
        updatedemployee1.setEmpAddress(user.getEmpAddress());
       
        userRepo.save(updatedemployee1);
        return "Updated User info successfully...";

    }
	
	
	
}