package com.co.mercadolibre.FindMutantsMagneto.controllers;

import com.co.mercadolibre.FindMutantsMagneto.business.BusinessService;
import com.co.mercadolibre.FindMutantsMagneto.business.DnaRequest;
import com.co.mercadolibre.FindMutantsMagneto.business.StatsResponse;
import com.co.mercadolibre.FindMutantsMagneto.exception.BusinessException;
import com.co.mercadolibre.FindMutantsMagneto.exception.RequestValidationException;
import java.util.ArrayList;

import com.co.mercadolibre.FindMutantsMagneto.models.DnaSequenceModel;
import com.co.mercadolibre.FindMutantsMagneto.services.DnaSequenceService;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/magnetoFind")
public class DnaSequenceController {
    @Autowired
    DnaSequenceService dnaSequenceService;

    @RequestMapping("/stats")
    @GetMapping()
    public StatsResponse obtenerDnaSequence(){
        ArrayList<DnaSequenceModel> DnaSequences = dnaSequenceService.obtenerDnaSequence();
        return BusinessService.getStat(DnaSequences);
    }

    @RequestMapping("/mutant")
    @PostMapping()
    public ResponseEntity isMutant(@RequestBody DnaRequest dnaSequence, HttpServletResponse httpServletResponse) {
        try {
            boolean response = false;
            if(RequestMutantValidator.validMutant(dnaSequence)){
                response = BusinessService.isMutant(dnaSequence);
            }
            
            DnaSequenceModel dnaSequenceModel = new DnaSequenceModel();
            dnaSequenceModel.setDnaSequence(Arrays.toString(dnaSequence.getDna()));
            dnaSequenceModel.setIsMutant(response);
            
            this.dnaSequenceService.guardarDnaSequence(dnaSequenceModel);
            
            if(response){
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
            }
        } catch (RequestValidationException ex) {
            Logger.getLogger(DnaSequenceController.class.getName()).log(Level.SEVERE, null, ex);
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        } catch (BusinessException ex) {
            Logger.getLogger(DnaSequenceController.class.getName()).log(Level.SEVERE, null, ex);
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }
}