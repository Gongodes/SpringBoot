package com.gongodes.paginajuegodevideo.service;

import com.gongodes.paginajuegodevideo.domain.videojuego;
import com.gongodes.paginajuegodevideo.repository.VideojuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class VideojuegoService {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<videojuego> buscarDestacados() {

        return videojuegoRepository.buscarTodos();

    }

    public List<videojuego> buscarPorDistribuidor(int distribuidorId) {

        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }
    
    
        public List<videojuego>buscar (String consulta) {
        
        return videojuegoRepository.findByNombreContaining(consulta);
        
        
        }
        
        public videojuego guardar(videojuego videojuego){
        return videojuegoRepository.save(videojuego);
        }

    
    
}
