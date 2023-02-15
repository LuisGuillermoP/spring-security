package com.example.securiymicroservice.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
public class Service implements SecurityService{

    @Override
    public ResponseEntity Saludo() {
        return ResponseEntity.status(HttpStatus.OK).body("hola mundo");
    }
}
