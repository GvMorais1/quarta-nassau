package br.com.crud.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.projeto.repository.UsuarioRepository;

import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bd")

public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;
}
