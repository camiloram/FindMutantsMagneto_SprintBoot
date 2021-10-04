package com.co.mercadolibre.FindMutantsMagneto.business;

/**
 * Clase que almacena el DNA provenieente del request y su resultado
 * @author Camilo Andres Ramirez Pava
 * @versión 1.0
 */
public class RegistryDna {
    
    public DnaRequest dnaRequest;
    boolean isMutant;

    public RegistryDna(DnaRequest dnaRequest, boolean isMutant) {
        this.dnaRequest = dnaRequest;
        this.isMutant = isMutant;
    }

    public DnaRequest getDnaRequest() {
        return dnaRequest;
    }

    public void setDnaRequest(DnaRequest dnaRequest) {
        this.dnaRequest = dnaRequest;
    }

    public boolean isIsMutant() {
        return isMutant;
    }

    public void setIsMutant(boolean isMutant) {
        this.isMutant = isMutant;
    }
    
    
}


