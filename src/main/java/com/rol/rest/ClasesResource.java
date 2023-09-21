package com.rol.rest;

import com.rol.model.ClasesDTO;
import com.rol.service.ClasesService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/clasess", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClasesResource {

    private final ClasesService clasesService;

    public ClasesResource(final ClasesService clasesService) {
        this.clasesService = clasesService;
    }

    @GetMapping
    public ResponseEntity<List<ClasesDTO>> getAllClasess() {
        return ResponseEntity.ok(clasesService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClasesDTO> getClases(@PathVariable final Long id) {
        return ResponseEntity.ok(clasesService.get(id));
    }

    @PostMapping
    public ResponseEntity<Long> createClases(@RequestBody @Valid final ClasesDTO clasesDTO) {
        final Long createdId = clasesService.create(clasesDTO);
        return new ResponseEntity<>(createdId, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Long> updateClases(@PathVariable final Long id,
            @RequestBody @Valid final ClasesDTO clasesDTO) {
        clasesService.update(id, clasesDTO);
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClases(@PathVariable final Long id) {
        clasesService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
