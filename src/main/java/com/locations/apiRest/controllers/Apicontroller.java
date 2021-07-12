/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locations.apiRest.controllers;


import com.locations.apiRest.entities.Locations;
import com.locations.apiRest.services.interfaces.ILocationServices;
import javafx.scene.media.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Flia Moreno Rivera
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/locations")


public class Apicontroller {
    
    @Autowired
    private ILocationServices iLocationServices;
    
    @GetMapping(value ="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index() {
        
        return  ResponseEntity.ok(this.iLocationServices.findAll());
    
    }
    
    
    @GetMapping(value ="/findBy/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findByName(@PathVariable("name") String name) {
        
        return  ResponseEntity.ok(this.iLocationServices.findByName(name));
    
    }
    
    @PostMapping(value ="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveLocation(@RequestBody Locations request){
        
        this.iLocationServices.save(request);
        
        return ResponseEntity.ok(Boolean.TRUE);
    }
    
    @GetMapping(value ="/delete/{location}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> DeleteLocation(@PathVariable("location") long location) {
        
        this.iLocationServices.deleteById(location);
        
        return ResponseEntity.ok(Boolean.TRUE);
    }
    
    
    
}
