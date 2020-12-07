
package com.gongodes.paginajuegodevideo.controller;


import com.gongodes.paginajuegodevideo.domain.videojuego;
import com.gongodes.paginajuegodevideo.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author gonza
 */

@Controller
public class ListadoController {
    
    private final VideojuegoService videojuegoservice;

    public ListadoController(VideojuegoService videojuegoservice) {
        this.videojuegoservice = videojuegoservice;
    }
    
    
    
    @RequestMapping("/")
    public String listarVideojuegos(Model model){
    List<videojuego>destacados = videojuegoservice.buscarDestacados();
    model.addAttribute("videjuegos", destacados);
        return "listado";
    
    }
    
    
        @RequestMapping("/videojuegosPorDistribuidor")
            public String listarvideojuegosPorDistribuidor( int distribuidorId, Model model){
                 List<videojuego>juegos = videojuegoservice.buscarPorDistribuidor(distribuidorId);
                 model.addAttribute("videjuegos", juegos);
                 return "listado";
    
}
            @RequestMapping("/buscar")
            public String buscar(@RequestParam("q")String consulta, Model model){
            List<videojuego>juegos = videojuegoservice.buscar(consulta);
            model.addAttribute("videjuegos",juegos );
                return "listado";

            }
            
}