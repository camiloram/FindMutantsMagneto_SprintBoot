package com.co.mercadolibre.FindMutantsMagneto.models;

import javax.persistence.*;

@Entity
@Table(name = "dna_sequence")
public class DnaSequenceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String DnaSequence;
    private boolean isMutant;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDnaSequence() {
        return this.DnaSequence;
    }

    public void setDnaSequence(String DnaSequence) {
        this.DnaSequence = DnaSequence;
    }

    public boolean isIsMutant() {
        return this.isMutant;
    }

    public boolean getIsMutant() {
        return this.isMutant;
    }

    public void setIsMutant(boolean isMutant) {
        this.isMutant = isMutant;
    }
    
}