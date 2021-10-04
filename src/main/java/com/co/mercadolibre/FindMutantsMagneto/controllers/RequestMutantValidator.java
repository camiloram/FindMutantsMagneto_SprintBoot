/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.mercadolibre.FindMutantsMagneto.controllers;

import com.co.mercadolibre.FindMutantsMagneto.business.DnaRequest;
import com.co.mercadolibre.FindMutantsMagneto.constants.EError;
import com.co.mercadolibre.FindMutantsMagneto.exception.RequestValidationException;

/**
 *
 * @author ECM3072C
 */
public class RequestMutantValidator {
    
    private static String dnaRegex = "[ACGT]+";

    public static boolean validMutant(DnaRequest request) throws RequestValidationException{
        String[] dnaRequest = request.getDna();
        
        if (dnaRequest == null || dnaRequest.length == 0){
            throw new RequestValidationException(EError.REQUEST_VALIDATION,
                    EError.REQUEST_VALIDATION.getDescription());
        } else {
            for (String dnaRow : dnaRequest) {
                if (!dnaRow.matches(dnaRegex)){
                    throw new RequestValidationException(EError.REQUEST_VALUE,
                            dnaRow + " - " + EError.REQUEST_VALUE.getDescription());
                }
            }
            for (String dnaRow : dnaRequest) {
                if(dnaRequest.length != dnaRow.length()){
                    throw new RequestValidationException(EError.REQUEST_VALUE_NUMBER,
                            dnaRow + " - " + dnaRow.length() + " - " + EError.REQUEST_VALUE_NUMBER.getDescription() + dnaRequest.length);
                }
            }
        }        
        return true;
    }    
}
