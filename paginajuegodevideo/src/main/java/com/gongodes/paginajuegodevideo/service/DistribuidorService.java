
package com.gongodes.paginajuegodevideo.service;

import com.gongodes.paginajuegodevideo.domain.Distribuidor;
import com.gongodes.paginajuegodevideo.repository.DistribuidorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class DistribuidorService {
    private final DistribuidorRepository distribuidorRrepository;

    public DistribuidorService(DistribuidorRepository distribuidorRrepository) {
        this.distribuidorRrepository = distribuidorRrepository;
    }

   public List<Distribuidor>buscarTodos(){
   return distribuidorRrepository.findAll();
   
   }
    
}
