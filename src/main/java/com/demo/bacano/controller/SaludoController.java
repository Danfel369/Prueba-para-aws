package com.demo.bacano.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SaludoController {

    @GetMapping("/saludito")
    public Map<String, String> saludo() {
        return Map.of(
                "mensaje", "Bienvenido a este proyecto bacano",
                "estado", "Bien bacano",
                "descripcion", " cambio pequeño para probar el despliegue de la app "
        );
    }
}
