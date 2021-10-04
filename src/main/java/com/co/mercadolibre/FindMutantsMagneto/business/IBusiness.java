package com.co.mercadolibre.FindMutantsMagneto.business;

import com.co.mercadolibre.FindMutantsMagneto.exception.BusinessException;
import javax.ejb.Local;

/**
 * interface del negocio
 * @author Camilo Andres Ramirez Pava
 * @versión 1.0
 */
@Local
public interface IBusiness {

    public boolean isMutant(DnaRequest dnaRequest) throws BusinessException;
    public StatsResponse getStat() throws BusinessException;
}
