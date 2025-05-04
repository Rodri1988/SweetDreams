package com.example.SweetDreams.Usuario.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("hola/usuario")
    public String saludaUsuario() {
        return "¡Hola Usuario!";
    }
}
