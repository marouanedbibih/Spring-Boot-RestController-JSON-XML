package org.marouanedbibih.restcontrollerjsonxml.controllers;

import java.util.List;

import org.marouanedbibih.restcontrollerjsonxml.models.Compte;
import org.marouanedbibih.restcontrollerjsonxml.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banque")
public class CompteController {

    @Autowired
    private CompteRepository repository;

    @GetMapping(value = "/comptes", produces = { "application/json", "application/xml" })
    public List<Compte> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/comptes/{id}", produces = { "application/json", "application/xml" })
    public ResponseEntity<Compte> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(compte -> ResponseEntity.ok().body(compte))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/comptes", produces = { "application/json", "application/xml" }, consumes = {
            "application/json", "application/xml" })
    public Compte create(@RequestBody Compte compte) {
        return repository.save(compte);
    }

    @PutMapping(value = "/comptes/{id}", produces = { "application/json", "application/xml" }, consumes = {
            "application/json", "application/xml" })
    public ResponseEntity<Compte> update(@PathVariable Long id, @RequestBody Compte request) {
        return repository.findById(id)
                .map(compte -> {
                    compte.setSolde(request.getSolde());
                    compte.setType(request.getType());
                    compte.setDateCreation(request.getDateCreation());
                    Compte updatedCompte = repository.save(compte);
                    return ResponseEntity.ok().body(updatedCompte);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/comptes/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return repository.findById(id)
                .map(compte -> {
                    repository.delete(compte);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.noContent().build());
    }
}
