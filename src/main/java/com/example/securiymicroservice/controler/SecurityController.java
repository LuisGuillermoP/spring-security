package com.example.securiymicroservice.controler;

import com.example.securiymicroservice.service.SecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class SecurityController {
    private final SecurityService service;
    public SecurityController(SecurityService service){
        this.service = service;
    }

    private static final Logger logger = LoggerFactory.getLogger(SecurityService.class);
    @GetMapping
    public ResponseEntity<?> holaMundo(){

        var auth  = SecurityContextHolder.getContext().getAuthentication();
        logger.info("Datos del usuario: {}", auth.getPrincipal());
        logger.info("Datos de los Permisos {}", auth.getAuthorities());
        logger.info("Esta autenticado {}", auth.isAuthenticated());
        return service.Saludo();

    };
}
