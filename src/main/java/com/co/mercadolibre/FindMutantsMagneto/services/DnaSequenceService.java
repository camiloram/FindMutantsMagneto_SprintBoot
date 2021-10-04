package com.co.mercadolibre.FindMutantsMagneto.services;

import java.util.ArrayList;

import com.co.mercadolibre.FindMutantsMagneto.models.DnaSequenceModel;
import com.co.mercadolibre.FindMutantsMagneto.repositories.DnaSequenceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DnaSequenceService {
    @Autowired
    DnaSequenceRepository dnaSequenceRepository;
    
    public ArrayList<DnaSequenceModel> obtenerDnaSequence(){
        return (ArrayList<DnaSequenceModel>) dnaSequenceRepository.findAll();
    }

    public DnaSequenceModel guardarDnaSequence(DnaSequenceModel dnaSequence){
        return dnaSequenceRepository.save(dnaSequence);
    }
}