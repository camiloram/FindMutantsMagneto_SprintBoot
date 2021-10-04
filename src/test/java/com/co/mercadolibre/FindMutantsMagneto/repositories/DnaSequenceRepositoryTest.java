/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.mercadolibre.FindMutantsMagneto.repositories;

import com.co.mercadolibre.FindMutantsMagneto.models.DnaSequenceModel;
import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DnaSequenceRepositoryTest {
    
    @Autowired
    DnaSequenceRepository dnaSequenceRepository;
    
    @Test
    public void findAll() {
         ArrayList<DnaSequenceModel> dnaSequences = dnaSequenceRepository.findAll();
         Assert.assertNotNull(dnaSequences);
    }
}
