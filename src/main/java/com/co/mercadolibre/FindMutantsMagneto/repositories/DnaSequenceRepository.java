package com.co.mercadolibre.FindMutantsMagneto.repositories;

import java.util.ArrayList;

import com.co.mercadolibre.FindMutantsMagneto.models.DnaSequenceModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DnaSequenceRepository extends CrudRepository<DnaSequenceModel, Long> {
    public abstract ArrayList<DnaSequenceModel> findAll();

}