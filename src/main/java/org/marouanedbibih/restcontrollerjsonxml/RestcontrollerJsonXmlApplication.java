package org.marouanedbibih.restcontrollerjsonxml;

import java.util.Arrays;
import java.util.Date;
import java.util.logging.Logger;

import org.marouanedbibih.restcontrollerjsonxml.models.Compte;
import org.marouanedbibih.restcontrollerjsonxml.models.TypeCompte;
import org.marouanedbibih.restcontrollerjsonxml.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestcontrollerJsonXmlApplication {

	Logger logger = Logger.getLogger(getClass().getName());

	public static void main(String[] args) {
		SpringApplication.run(RestcontrollerJsonXmlApplication.class, args);
	}


    @Bean
    public CommandLineRunner initDatabase(CompteRepository compteRepository) {
        return args -> {
            compteRepository.saveAll(Arrays.asList(
                Compte.builder()
                    .solde(1000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build(),
                Compte.builder()
                    .solde(2000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.EPARGNE)
                    .build(),
                Compte.builder()
                    .solde(3000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build(),
                Compte.builder()
                    .solde(4000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.EPARGNE)
                    .build(),
                Compte.builder()
                    .solde(5000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build()
            ));

            logger.info("5 comptes have been inserted into the database.");
        };
    }

}
