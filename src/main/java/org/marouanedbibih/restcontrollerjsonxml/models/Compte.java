package org.marouanedbibih.restcontrollerjsonxml.models;

import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comptes")
@Builder
@JacksonXmlRootElement(localName = "ompte")
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double solde;
    private TypeCompte type;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;

}
