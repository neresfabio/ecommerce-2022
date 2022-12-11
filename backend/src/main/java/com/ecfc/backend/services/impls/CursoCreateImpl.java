package com.ecfc.backend.services.impls;

import com.ecfc.backend.controllers.dtos.CursoDTO;
import com.ecfc.backend.entities.Curso;
import com.ecfc.backend.repositories.CursoRepository;
import com.ecfc.backend.services.IServiceCreate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
public class CursoCreateImpl implements IServiceCreate<CursoDTO> {
    final CursoRepository repository;

    public CursoCreateImpl(CursoRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public CursoDTO save(CursoDTO cursoDTO) {
        Curso cursoNew = new Curso(cursoDTO);
        cursoNew.setDataEntrada(new Date());
        cursoNew = repository.save(cursoNew);
        cursoDTO = new CursoDTO(cursoNew);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoDTO).getBody();
    }
}
