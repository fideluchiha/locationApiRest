/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locations.apiRest.services.interfaces;

import com.locations.apiRest.entities.Locations;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Flia Moreno Rivera
 */
@Service
public interface ILocationServices {
    
    List<Locations> findAll();
    
     @Transactional(readOnly=false)
    Optional<Locations> findById(Long id);
    Optional<Locations> findByName(String name);
    
    void save(Locations TblLocations);
    
    void deleteById(long idLocation);
}
