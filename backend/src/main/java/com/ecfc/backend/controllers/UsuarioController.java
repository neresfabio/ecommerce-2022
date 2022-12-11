package com.ecfc.backend.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class UsuarioController {
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody UsuarioDTO usuarioDTO){
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable(value = "id") Long id){
        return null;
    }
    @GetMapping
    public ResponseEntity<Object> findByAll( @PageableDefault(page = 0, size = 10, sort = "id",direction = Sort.Direction.ASC) Pageable pageable){
        return null;
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable(value = "id") Long id, @RequestBody UsuarioDTO usuarioDTO){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") Long id){
        return null;
    }
}
