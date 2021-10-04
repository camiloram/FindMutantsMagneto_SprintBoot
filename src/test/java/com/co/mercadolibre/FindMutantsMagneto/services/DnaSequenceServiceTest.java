/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.mercadolibre.FindMutantsMagneto.services;

import com.co.mercadolibre.FindMutantsMagneto.business.DnaRequest;
import com.co.mercadolibre.FindMutantsMagneto.models.DnaSequenceModel;
import com.co.mercadolibre.FindMutantsMagneto.repositories.DnaSequenceRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DnaSequenceServiceTest {
    
    @Autowired
    DnaSequenceRepository dnaSequenceRepository;
    
    @Test
    public void obtenerDnaSequence () {
         ArrayList<DnaSequenceModel> dnaSequences = dnaSequenceRepository.findAll();
         Assert.assertNotNull(dnaSequences);
    }
    
    @Test
    public void testGuardarDnaSequence () {
        
        boolean validacionExitosa = false;
        
        DnaSequenceModel dnaSequenceModel = new DnaSequenceModel();
        List<String> list = new ArrayList<String>();
        Random claseRandom = new Random();
        int dimensionSecuencia = 4 + claseRandom.nextInt(10 - 4);
        
        for (int i = 0; i < dimensionSecuencia; i++) {
            list.add(getRandomString(dimensionSecuencia));
        }
        String[] dnaSequence = list.stream().toArray(String[]::new);
        
        dnaSequenceModel.setIsMutant(validacionExitosa);
        dnaSequenceModel.setDnaSequence(Arrays.toString(dnaSequence));
        
        dnaSequenceRepository.save(dnaSequenceModel);
        validacionExitosa = true;
        Assert.assertTrue(validacionExitosa);
    }

    private String getRandomString(int dimensionSecuencia) {
        String caracteresSecuencia = "ACGT";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < dimensionSecuencia) {
            int index = (int) (rnd.nextFloat() * caracteresSecuencia.length());
            salt.append(caracteresSecuencia.charAt(index));
        }
        return salt.toString();
    }
}