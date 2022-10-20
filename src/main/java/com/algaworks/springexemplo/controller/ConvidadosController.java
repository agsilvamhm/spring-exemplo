package com.algaworks.springexemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvidadosController {

    @GetMapping
    public String listar(){
       return "ListaConvidados";
  }
}
