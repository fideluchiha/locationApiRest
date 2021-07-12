/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locations.apiRest.services.implementation;


import com.locations.apiRest.entities.Locations;
import com.locations.apiRest.repository.LocationsRepository;
import com.locations.apiRest.services.interfaces.ILocationServices;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

/**
 *
 * @author Flia Moreno Rivera
 */
@Component
public class LocationImplements implements ILocationServices{
    
    @Autowired
    private LocationsRepository locationsRepository;

    @Override
    public List<Locations> findAll() {
        
        Iterable<Locations> TblLocations = this.locationsRepository.findAll();
        
        return (List<Locations>) TblLocations; 
    }

    @Override
    public Optional<Locations> findById(Long id) {
        
        Optional<Locations> Locations = this.locationsRepository.findById(id);
        
        if (!Locations.isPresent()) {
            
            return null;
        }
        
        return Locations;
    }

    @Override
    public Optional<Locations> findByName(String name) {
        
        Optional<Locations> Locations = this.locationsRepository.findByName(name);
        
        if (!Locations.isPresent()) {
            
            return null;
        }
        
        return Locations;}

    @Override
    public void save(Locations TblLocations) {
        
        this.locationsRepository.save(TblLocations);
    }

    @Override
    public void deleteById(long idLocation) {
        
        this.locationsRepository.deleteById(idLocation);
    }

    

   

   
    
    
}
