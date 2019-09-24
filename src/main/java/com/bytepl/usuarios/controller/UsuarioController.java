package com.bytepl.usuarios.controller;

import com.bytepl.usuarios.entity.Usuario;
import com.bytepl.usuarios.model.MUsuario;
import com.bytepl.usuarios.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService service;

    @GetMapping("/todos")
    public ModelAndView getUsuarios(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("usuarios", service.findAll()
                    .stream()
                        .map(usuario -> new MUsuario(usuario))
                        .collect(Collectors.toList()));
        return modelAndView;
    }

    @GetMapping("/nuevo")
    public ModelAndView nuevo(){
        ModelAndView modelAndView = new ModelAndView("usuario_nuevo");
        modelAndView.setViewName("usuario_nuevo");
        modelAndView.addObject("usuario", new Usuario());
        return modelAndView;
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute Usuario usuario){
        service.save(usuario);
        return "redirect:/usuario/todos";
    }

    @GetMapping("/borrar/{id}")
    public String borrarPorId(@PathVariable long id){
        service.deleteById(id);
        return "redirect:/usuario/todos";
    }

    @GetMapping("/obtener")
    public ModelAndView obtenerId(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("usuario");
        modelAndView.setViewName("usuario");
        modelAndView.addObject("usuario", service.findById(id));
        return modelAndView;
    }
}
