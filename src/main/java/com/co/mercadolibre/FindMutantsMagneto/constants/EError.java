package com.co.mercadolibre.FindMutantsMagneto.constants;

/**
 * Clase enumeracion que representa valores del tipo EError
 *
 * @author Camilo Andres Ramirez Pava
 * @versión 1.0
 */
public enum EError {

    REQUEST_VALIDATION("REQUEST_VALIDATION_ERROR", "Request DNA no valid"),
    REQUEST_VALUE("REQUEST_VALUE_ERROR", "Request, Invalid DNA base character"),
    REQUEST_VALUE_NUMBER("REQUEST_VALUE_NUMBER_ERROR", "Request, invalid DNA base character number, row number is ");
    
    private String code;
    private String description;

    /**
     * @param code
     * @param description 
     */
    private EError(String code, String description) {
        this.code = code;
        this.description = description;
    }
    
    /**
     * @return 
     */
    public String getCode() {
        return code;
    }
    
    /**
     * @return 
     */
    public String getDescription() {
        return description;
    }
}
