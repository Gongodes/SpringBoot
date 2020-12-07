
package com.gongodes.paginajuegodevideo.controller;

import com.gongodes.paginajuegodevideo.domain.videojuego;
import com.gongodes.paginajuegodevideo.service.DistribuidorService;
import com.gongodes.paginajuegodevideo.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author gonza
 */
@Controller
public class VideojuegoAbmController {
    
    
    private final DistribuidorService distribuidorService;
    private final VideojuegoService videojuegoService;

    public VideojuegoAbmController(DistribuidorService distribuidorService, VideojuegoService videojuegoService) {
        this.distribuidorService = distribuidorService;
        this.videojuegoService = videojuegoService;
    }

    
    
    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model){
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new videojuego());
    return "formVideojuego";}
    
    /**
     *
     * @param videojuego
     * @return
     */
    @PostMapping("/videojuegos/guardar")
    public String guardar(videojuego videojuego){
        videojuegoService.guardar(videojuego);
           return "redirect:/";
    }
    
    
}
