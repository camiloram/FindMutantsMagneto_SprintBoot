package com.co.mercadolibre.FindMutantsMagneto.business;

/**
 * Clase que mapea el DNA provenieente del request
 * @author Camilo Andres Ramirez Pava
 * @versión 1.0
 */
public class DnaRequest {
    String[] dna;

    public DnaRequest() {
    }
    
    public DnaRequest(String[] dna) {
        this.dna = dna;
    }

    public String[] getDna() {
        return dna;
    }

    public void setDna(String[] dna) {
        this.dna = dna;
    }
}


