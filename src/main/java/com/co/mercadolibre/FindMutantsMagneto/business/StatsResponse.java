package com.co.mercadolibre.FindMutantsMagneto.business;

/**
 * Clase que mapea el response del metodo stats
 * @author Camilo Andres Ramirez Pava
 * @versión 1.0
 */
public class StatsResponse {
    long count_mutant_dna;
    long count_human_dna;
    Double ratio;

    public StatsResponse() {
    }

    public StatsResponse(long count_mutant_dna, long count_human_dna, Double ratio) {
        this.count_mutant_dna = count_mutant_dna;
        this.count_human_dna = count_human_dna;
        this.ratio = ratio;
    }

    public long getCount_mutant_dna() {
        return count_mutant_dna;
    }

    public void setCount_mutant_dna(long count_mutant_dna) {
        this.count_mutant_dna = count_mutant_dna;
    }

    public long getCount_human_dna() {
        return count_human_dna;
    }

    public void setCount_human_dna(long count_human_dna) {
        this.count_human_dna = count_human_dna;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}
