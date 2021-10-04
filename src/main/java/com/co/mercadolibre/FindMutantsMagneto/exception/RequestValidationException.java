package com.co.mercadolibre.FindMutantsMagneto.exception;

import com.co.mercadolibre.FindMutantsMagneto.constants.EError;

/**
 * Clase que representa excepiones de tipo RequestValidationException
 *
 * @author Camilo Andres Ramirez Pava
 * @versión 1.0
 */
public class RequestValidationException extends BusinessException {
    
    public RequestValidationException(EError error, String message) {
        super(message);
        this.error = error;
    }
}
