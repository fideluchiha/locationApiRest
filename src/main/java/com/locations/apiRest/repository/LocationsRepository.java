/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locations.apiRest.repository;

import com.locations.apiRest.entities.Locations;
import java.util.Optional;
import org.springframework.data.domain.Page;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Flia Moreno Rivera
 */
@Repository

public interface LocationsRepository extends CrudRepository<Locations, Long>{
    
    @Transactional(readOnly=false)
    Optional<Locations> findById(Long id);
    Optional<Locations> findByName(String name);
    
    
    
}
