package org.marouanedbibih.restcontrollerjsonxml.repositories;

import org.marouanedbibih.restcontrollerjsonxml.models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {
    
}
