
package com.gongodes.paginajuegodevideo.repository;

import com.gongodes.paginajuegodevideo.domain.videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author gonza
 */
public interface VideojuegoRepository extends JpaRepository<videojuego, Integer>  {
    
    @Query("from videojuego v order by v.nombre")
    List<videojuego> buscarTodos();
    
    /**
     *
     * @param distribuidorId
     * @return
     */
    @Query("from videojuego v where v.distribuidor.id= ?1 order by v.nombre")
    List<videojuego>buscarPorDistribuidor(int distribuidorId );
    
     
    //@Query("from videojuego v where v.nombre like %?1%")
    List<videojuego>findByNombreContaining(String consulta);
    
    
    
    
    
}
