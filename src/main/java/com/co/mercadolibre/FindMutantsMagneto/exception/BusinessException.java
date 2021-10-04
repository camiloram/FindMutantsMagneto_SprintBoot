package com.co.mercadolibre.FindMutantsMagneto.exception;

import com.co.mercadolibre.FindMutantsMagneto.constants.EError;

/**
 * Clase que representa excepiones de tipo BusinessException
 *
 * @author Camilo Andres Ramirez Pava
 * @versión 1.0
 */
public class BusinessException extends Exception {

    protected EError error;

    protected BusinessException(String message) {
        super(message);
    }
    
    public BusinessException(EError error, String message) {
        super(message);
        this.error = error;
    }
    
    public EError getError() {
        return error;
    }

}
