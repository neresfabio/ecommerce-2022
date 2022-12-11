package com.ecfc.backend.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class MatriculaController {
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody MatriculaDTO matriculaDTO){
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
    public ResponseEntity<Object> update(@PathVariable(value = "id") Long id, @RequestBody MatriculaDTO matriculaDTO){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") Long id){
        return null;
    }
}
